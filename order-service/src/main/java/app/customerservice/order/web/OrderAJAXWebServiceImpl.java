package app.customerservice.order.web;

import app.customerservice.api.OrderAJAXWebService;
import app.customerservice.api.order.CreateOrderRequest;
import app.customerservice.api.order.CreateOrderResponse;
import app.customerservice.api.order.OrderStatusResponse;
import app.customerservice.api.order.SearchOrderRequest;
import app.customerservice.api.order.SearchOrderResponse;
import app.customerservice.api.order.UpdateOrderRequest;
import app.customerservice.api.order.UpdateOrderResponse;
import app.customerservice.order.service.OrderService;
import core.framework.inject.Inject;

/**
 * @author: Cheffey
 */
public class OrderAJAXWebServiceImpl implements OrderAJAXWebService {
    @Inject
    OrderService orderService;

    @Override
    public UpdateOrderResponse cancel(String id, UpdateOrderRequest request) {
        return null;
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
    public OrderStatusResponse getStatus(String id) {
        return null;
    }
}
