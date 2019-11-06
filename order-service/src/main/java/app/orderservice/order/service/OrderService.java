package app.orderservice.order.service;

import app.orderservice.api.fulfillment.CreateFulfillmentRequest;
import app.orderservice.api.fulfillment.CreateFulfillmentResponse;
import app.orderservice.api.fulfillment.FulfillmentView;
import app.orderservice.api.fulfillment.SearchFulfillmentRequest;
import app.orderservice.api.order.CreateOrderRequest;
import app.orderservice.api.order.CreateOrderResponse;
import app.orderservice.api.order.OrderView;
import app.orderservice.api.order.ReadOrderResponse;
import app.orderservice.api.order.SearchOrderRequest;
import app.orderservice.api.order.SearchOrderResponse;
import app.orderservice.api.order.UpdateOrderRequest;
import app.orderservice.api.order.UpdateOrderResponse;
import app.orderservice.fulfillment.service.FulfillmentService;
import app.orderservice.order.domain.Order;
import core.framework.db.Database;
import core.framework.db.Query;
import core.framework.db.Repository;
import core.framework.db.Transaction;
import core.framework.inject.Inject;
import core.framework.web.exception.NotFoundException;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class OrderService {
    @Inject
    Repository<Order> orderRepository;

    @Inject
    FulfillmentService fulfillmentService;

    @Inject
    Database database;


    public UpdateOrderResponse update(String id, UpdateOrderRequest request) {
        UpdateOrderResponse updateOrderResponse = new UpdateOrderResponse();
        Order order = orderRepository.get(id).orElseThrow(() -> new NotFoundException("Cannot find order, id=" + id));
        order.address = request.address;
        order.totalCost = request.total;
        try (Transaction transaction = database.beginTransaction()) {
            orderRepository.partialUpdate(order);
            transaction.commit();
        }
        if (request.items != null) {
            updateOrderResponse.fulfillments = request.items.stream().map(item -> {
                CreateFulfillmentRequest createFulfillmentRequest = new CreateFulfillmentRequest();
                createFulfillmentRequest.items = Arrays.asList(item);
                createFulfillmentRequest.orderId = order.id;
                return view(fulfillmentService.create(createFulfillmentRequest));
            }).collect(Collectors.toList());
        } else {
            SearchFulfillmentRequest searchRequest = new SearchFulfillmentRequest();
            searchRequest.orderId = id;
            updateOrderResponse.fulfillments = fulfillmentService.search(searchRequest).fulfillments;
        }
        updateOrderResponse.id = order.id;
        updateOrderResponse.address = order.address;
        updateOrderResponse.totalCost = order.totalCost;
        return updateOrderResponse;
    }


    public CreateOrderResponse create(CreateOrderRequest request) {
        CreateOrderResponse createOrderResponse = new CreateOrderResponse();
        Order order = new Order();
        order.id = UUID.randomUUID().toString();
        order.address = request.address;
        order.totalCost = checkPrice(request.items) + request.tip;
        orderRepository.insert(order);
        createOrderResponse.fulfillments = request.items.stream().map(p -> {
            CreateFulfillmentRequest createFulfillmentRequest = new CreateFulfillmentRequest();
            createFulfillmentRequest.items = Arrays.asList(p);
            createFulfillmentRequest.orderId = order.id;
            return view(fulfillmentService.create(createFulfillmentRequest));
        }).collect(Collectors.toList());
        createOrderResponse.id = order.id;
        createOrderResponse.address = order.address;
        createOrderResponse.totalCost = order.totalCost;
        return createOrderResponse;
    }

    public ReadOrderResponse get(String id) {
        Order order = orderRepository.get(id).orElseThrow(() -> new NotFoundException(("Cannot find order with id: " + id)));
        ReadOrderResponse readOrderResponse = new ReadOrderResponse();
        readOrderResponse.fulfillments = fulfillmentService.search(searchById(id)).fulfillments;
        readOrderResponse.address = order.address;
        readOrderResponse.id = order.id;
        readOrderResponse.totalCost = order.totalCost;
        return readOrderResponse;
    }

    public void delete(String id) {
        orderRepository.delete(id);
    }

    public SearchOrderResponse search(SearchOrderRequest request) {
        SearchOrderResponse searchOrderResponse = new SearchOrderResponse();
        Query<Order> query = orderRepository.select();
        if (request.address != null) {
            query.where("address = ?", request.address);
        }
        if (request.items != null) {
            query.where("items = ?", request.items);//for further design
        }
        if (request.id != null) {
            query.where("id = ?", request.id);
        }
        if (request.tip != null) {
            query.where("tip = ?", request.tip);
        }
        searchOrderResponse.orderViews = query.fetch().stream().map(order -> {
            OrderView orderView = new OrderView();
            orderView.address = order.address;
            orderView.id = order.id;
            orderView.totalCost = order.totalCost;
            orderView.fulfillments = fulfillmentService.search(searchById(order.id)).fulfillments;
            return orderView;
        }).collect(Collectors.toList());
        searchOrderResponse.total = searchOrderResponse.orderViews.size();
        return searchOrderResponse;
    }

    private double checkPrice(List<String> items) {
        int total = 0;
        for (String item : items) {
            total += (Math.abs(item.hashCode()) % 250) / 10;
        }
        return total;
    }

    private FulfillmentView view(CreateFulfillmentResponse createFulfillmentResponse) {
        FulfillmentView fulfillmentView = new FulfillmentView();
        fulfillmentView.id = createFulfillmentResponse.id;
        fulfillmentView.items = createFulfillmentResponse.items;
        fulfillmentView.status = createFulfillmentResponse.status;
        return fulfillmentView;
    }

    private SearchFulfillmentRequest searchById(String id) {
        SearchFulfillmentRequest searchRequest = new SearchFulfillmentRequest();
        searchRequest.orderId = id;
        return searchRequest;
    }
}
