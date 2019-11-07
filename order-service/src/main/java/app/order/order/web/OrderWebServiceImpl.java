package app.order.order.web;

import app.order.api.OrderWebService;
import app.order.api.order.CreateOrderRequest;
import app.order.api.order.CreateOrderResponse;
import app.order.api.order.ReadOrderResponse;
import app.order.api.order.SearchOrderRequest;
import app.order.api.order.SearchOrderBOAJAXResponse;
import app.order.api.order.UpdateOrderRequest;
import app.order.api.order.UpdateOrderResponse;
import app.order.order.service.OrderService;
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
    public SearchOrderBOAJAXResponse search(SearchOrderRequest request) {
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
