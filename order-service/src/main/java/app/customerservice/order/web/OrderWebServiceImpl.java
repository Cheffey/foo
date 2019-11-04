package app.customerservice.order.web;

import app.customerservice.api.OrderWebService;
import app.customerservice.api.order.*;
import app.customerservice.order.service.OrderService;
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
