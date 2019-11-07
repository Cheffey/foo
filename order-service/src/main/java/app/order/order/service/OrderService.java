package app.order.order.service;

import app.order.api.fulfillment.BOCreateFulfillmentRequest;
import app.order.api.fulfillment.BOCreateFulfillmentResponse;
import app.order.api.fulfillment.BOSearchFulfillmentRequest;
import app.order.api.fulfillment.FulfillmentView;
import app.order.api.order.BOCreateOrderRequest;
import app.order.api.order.BOCreateOrderResponse;
import app.order.api.order.BOSearchOrderAJAXRequest;
import app.order.api.order.BOSearchOrderAJAXResponse;
import app.order.api.order.BOSearchOrderRequest;
import app.order.api.order.BOSearchOrderResponse;
import app.order.api.order.BOUpdateOrderRequest;
import app.order.api.order.BOUpdateOrderResponse;
import app.order.api.order.GetOrderResponse;
import app.order.api.order.OrderView;
import app.order.fulfillment.service.FulfillmentService;
import app.order.order.domain.Order;
import core.framework.db.Database;
import core.framework.db.Query;
import core.framework.db.Repository;
import core.framework.db.Transaction;
import core.framework.inject.Inject;
import core.framework.web.exception.NotFoundException;

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


    public BOUpdateOrderResponse update(String id, BOUpdateOrderRequest request) {
        BOUpdateOrderResponse boUpdateOrderResponse = new BOUpdateOrderResponse();
        Order order = orderRepository.get(id).orElseThrow(() -> new NotFoundException("Cannot find order, id=" + id));
        order.address = request.address;
        order.totalCost = request.total;
        try (Transaction transaction = database.beginTransaction()) {
            orderRepository.partialUpdate(order);
            transaction.commit();
        }
        if (request.items != null) {
            boUpdateOrderResponse.fulfillments = request.items.stream().map(item -> {
                BOCreateFulfillmentRequest boCreateFulfillmentRequest = new BOCreateFulfillmentRequest();
                boCreateFulfillmentRequest.items = List.of(item);
                boCreateFulfillmentRequest.orderId = order.id;
                return view(fulfillmentService.create(boCreateFulfillmentRequest));
            }).collect(Collectors.toList());
        } else {
            BOSearchFulfillmentRequest searchRequest = new BOSearchFulfillmentRequest();
            searchRequest.orderId = id;
            boUpdateOrderResponse.fulfillments = fulfillmentService.search(searchRequest).fulfillments;
        }
        boUpdateOrderResponse.id = order.id;
        boUpdateOrderResponse.address = order.address;
        boUpdateOrderResponse.totalCost = order.totalCost;
        return boUpdateOrderResponse;
    }


    public BOCreateOrderResponse create(BOCreateOrderRequest request) {
        BOCreateOrderResponse boCreateOrderResponse = new BOCreateOrderResponse();
        Order order = new Order();
        order.id = UUID.randomUUID().toString();
        order.address = request.address;
        order.totalCost = checkPrice(request.items) + request.tip;
        orderRepository.insert(order);
        boCreateOrderResponse.fulfillments = request.items.stream().map(item -> {
            BOCreateFulfillmentRequest boCreateFulfillmentRequest = new BOCreateFulfillmentRequest();
            boCreateFulfillmentRequest.items = List.of(item);
            boCreateFulfillmentRequest.orderId = order.id;
            return view(fulfillmentService.create(boCreateFulfillmentRequest));
        }).collect(Collectors.toList());
        boCreateOrderResponse.id = order.id;
        boCreateOrderResponse.address = order.address;
        boCreateOrderResponse.totalCost = order.totalCost;
        return boCreateOrderResponse;
    }

    public GetOrderResponse get(String id) {
        Order order = orderRepository.get(id).orElseThrow(() -> new NotFoundException("Cannot find order with id: " + id));
        GetOrderResponse getOrderResponse = new GetOrderResponse();
        getOrderResponse.fulfillments = fulfillmentService.search(searchById(id)).fulfillments;
        getOrderResponse.address = order.address;
        getOrderResponse.id = order.id;
        getOrderResponse.totalCost = order.totalCost;
        return getOrderResponse;
    }

    public void delete(String id) {
        orderRepository.delete(id);
    }

    private double checkPrice(List<String> items) {
        int total = 0;
        for (String item : items) {
            total += (item.hashCode() % 250) / 10;
        }
        return total;
    }

    public BOSearchOrderResponse search(BOSearchOrderRequest request) {
        BOSearchOrderResponse boSearchOrderResponse = new BOSearchOrderResponse();
        Query<Order> query = orderRepository.select();
        if (request.address != null) {
            query.where("address = ?", request.address);
        }
        if (request.items != null) {
            query.where("items = ?", request.items); //for further design
        }
        if (request.id != null) {
            query.where("id = ?", request.id);
        }
        if (request.tip != null) {
            query.where("tip = ?", request.tip);
        }
        boSearchOrderResponse.orderViews = query.fetch().stream().map(order -> {
            OrderView orderView = new OrderView();
            orderView.address = order.address;
            orderView.id = order.id;
            orderView.totalCost = order.totalCost;
            orderView.fulfillments = fulfillmentService.search(searchById(order.id)).fulfillments;
            return orderView;
        }).collect(Collectors.toList());
        boSearchOrderResponse.total = boSearchOrderResponse.orderViews.size();
        return boSearchOrderResponse;
    }

    public BOSearchOrderAJAXResponse search(BOSearchOrderAJAXRequest request) {
        BOSearchOrderAJAXResponse boSearchOrderAJAXResponse = new BOSearchOrderAJAXResponse();
        Query<Order> query = orderRepository.select();
        if (request.address != null) {
            query.where("address = ?", request.address);
        }
        if (request.items != null) {
            query.where("items = ?", request.items); //for further design
        }
        if (request.id != null) {
            query.where("id = ?", request.id);
        }
        if (request.tip != null) {
            query.where("tip = ?", request.tip);
        }
        boSearchOrderAJAXResponse.orderViews = query.fetch().stream().map(order -> {
            OrderView orderView = new OrderView();
            orderView.address = order.address;
            orderView.id = order.id;
            orderView.totalCost = order.totalCost;
            orderView.fulfillments = fulfillmentService.search(searchById(order.id)).fulfillments;
            return orderView;
        }).collect(Collectors.toList());
        boSearchOrderAJAXResponse.total = boSearchOrderAJAXResponse.orderViews.size();
        return boSearchOrderAJAXResponse;
    }


    private FulfillmentView view(BOCreateFulfillmentResponse boCreateFulfillmentResponse) {
        FulfillmentView fulfillmentView = new FulfillmentView();
        fulfillmentView.id = boCreateFulfillmentResponse.id;
        fulfillmentView.items = boCreateFulfillmentResponse.items;
        fulfillmentView.status = boCreateFulfillmentResponse.status;
        return fulfillmentView;
    }

    private BOSearchFulfillmentRequest searchById(String id) {
        BOSearchFulfillmentRequest searchRequest = new BOSearchFulfillmentRequest();
        searchRequest.orderId = id;
        return searchRequest;
    }
}
