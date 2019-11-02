package app.customerservice.order.service;

import app.customerservice.api.order.*;
import app.customerservice.order.domain.Order;
import core.framework.db.Repository;
import core.framework.inject.Inject;
import core.framework.web.exception.NotFoundException;

import java.util.UUID;

public class OrderService {
    @Inject
    Repository<Order> orderRepository;

    public UpdateOrderResponse update(String id, UpdateOrderRequest request) {
        Order order=orderRepository.get(id).orElseThrow(() -> new NotFoundException("Cannot order, id=" + id));
        order.address = request.address;
        order.totalCost = checkPrice(request.item) + request.tip;
        order.fulfillmentIds = request.item;
        orderRepository.partialUpdate(order);
        UpdateOrderResponse updateOrderResponse = new UpdateOrderResponse();
        updateOrderResponse.id = order.id;
        updateOrderResponse.address = order.address;
        updateOrderResponse.totalCost = order.totalCost;
        updateOrderResponse.item = order.fulfillmentIds;

        return updateOrderResponse;
    }

    public CreateOrderResponse create(CreateOrderRequest request) {
        Order order = new Order();
        order.id = UUID.randomUUID().toString();
        order.address = request.address;
        order.totalCost = checkPrice(request.item) + request.tip;
        order.fulfillmentIds = request.item;
        orderRepository.insert(order);

        CreateOrderResponse createOrderResponse = new CreateOrderResponse();
        createOrderResponse.id = order.id;
        createOrderResponse.address = order.address;
        createOrderResponse.totalCost = order.totalCost;
        createOrderResponse.item = order.fulfillmentIds;

        return createOrderResponse;
    }

    public ReadOrderResponse read(String id) {
        Order order = orderRepository.get(id).orElseThrow(() -> new NotFoundException(("Cannot find order with id: " + id)));
        ReadOrderResponse readOrderResponse = new ReadOrderResponse();
        readOrderResponse.address = order.address;
        readOrderResponse.id = order.id;
        readOrderResponse.item = order.fulfillmentIds;
        readOrderResponse.totalCost = order.totalCost;
        return readOrderResponse;
    }

    public void delete(String id) {
        orderRepository.delete(id);
    }

    private double checkPrice(String item) {
        return ((item.hashCode()) % 250) / 10;
    }
}
