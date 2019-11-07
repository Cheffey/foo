package app.order.order.web;

import app.order.api.BOOrderWebService;
import app.order.api.order.BOCreateOrderRequest;
import app.order.api.order.BOCreateOrderResponse;
import app.order.api.order.BOSearchOrderRequest;
import app.order.api.order.BOSearchOrderResponse;
import app.order.api.order.BOUpdateOrderRequest;
import app.order.api.order.BOUpdateOrderResponse;
import app.order.api.order.GetOrderResponse;
import app.order.order.service.OrderService;
import core.framework.inject.Inject;

/**
 * @author: Cheffey
 */
public class BOOrderWebServiceImpl implements BOOrderWebService {
    @Inject
    OrderService orderService;

    @Override
    public BOUpdateOrderResponse update(String id, BOUpdateOrderRequest request) {
        return orderService.update(id, request);
    }

    @Override
    public BOSearchOrderResponse search(BOSearchOrderRequest request) {
        return orderService.search(request);
    }

    @Override
    public BOCreateOrderResponse create(BOCreateOrderRequest request) {
        return orderService.create(request);
    }

    @Override
    public GetOrderResponse get(String id) {
        return orderService.get(id);
    }

    @Override
    public void delete(String id) {
        orderService.delete(id);
    }
}
