package app.customerservice.order.web;

import app.customerservice.api.AJAXOrderWebService;
import app.customerservice.api.order.*;
import app.customerservice.order.service.OrderService;
import core.framework.inject.Inject;

/**
 * @author: Cheffey
 */
public class AJAXOrderWebServiceImpl implements AJAXOrderWebService {
    @Inject
    OrderService orderService;

    @Override
    public UpdateOrderResponse update(String id, UpdateOrderRequest request) {
        return orderService.update(id, request);
    }

    @Override
    public CreateOrderResponse create(CreateOrderRequest request) {
        return orderService.create(request);
    }

    @Override
    public ReadOrderResponse read(String id) {
        return orderService.read(id);
    }

    @Override
    public void delete(String id) {
        orderService.delete(id);
    }
}
