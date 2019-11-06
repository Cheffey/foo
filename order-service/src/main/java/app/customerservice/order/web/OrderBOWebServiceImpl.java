package app.customerservice.order.web;

import app.customerservice.api.OrderBOWebService;
import app.customerservice.api.order.CreateOrderRequest;
import app.customerservice.api.order.CreateOrderResponse;
import app.customerservice.api.order.ReadOrderResponse;
import app.customerservice.api.order.SearchOrderRequest;
import app.customerservice.api.order.SearchOrderResponse;
import app.customerservice.api.order.UpdateOrderRequest;
import app.customerservice.api.order.UpdateOrderResponse;
import app.customerservice.order.service.OrderService;
import core.framework.inject.Inject;

/**
 * @author: Cheffey
 */
public class OrderBOWebServiceImpl implements OrderBOWebService {
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
