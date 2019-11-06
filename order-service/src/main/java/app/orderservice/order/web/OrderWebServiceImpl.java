package app.orderservice.order.web;

import app.orderservice.api.OrderWebService;
import app.orderservice.api.order.CreateOrderRequest;
import app.orderservice.api.order.CreateOrderResponse;
import app.orderservice.api.order.ReadOrderResponse;
import app.orderservice.api.order.SearchOrderRequest;
import app.orderservice.api.order.SearchOrderResponse;
import app.orderservice.api.order.UpdateOrderRequest;
import app.orderservice.api.order.UpdateOrderResponse;
import app.orderservice.order.service.OrderService;
import core.framework.inject.Inject;

/**
 * @author: Cheffey
 */
public class OrderWebServiceImpl implements OrderWebService {
    @Inject
    OrderService orderService;

    @Override
    public UpdateOrderResponse update(String id, UpdateOrderRequest request) {
        return orderService.update(id, request);
    }

    @Override
    public SearchOrderResponse search(SearchOrderRequest request) {
        return orderService.search(request);
    }

    @Override
    public CreateOrderResponse create(CreateOrderRequest request) {
        return orderService.create(request);
    }

    @Override
    public ReadOrderResponse get(String id) {
        return orderService.get(id);
    }

    @Override
    public void delete(String id) {
        orderService.delete(id);
    }
}
