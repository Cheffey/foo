package app.order.order.web;

import app.order.api.OrderWebService;
import app.order.api.order.GetOrderResponse;
import app.order.order.service.OrderService;
import core.framework.inject.Inject;

/**
 * @author: Cheffey
 */
public class OrderWebServiceImpl implements OrderWebService {
    @Inject
    OrderService orderService;

    @Override
    public GetOrderResponse get(String id) {
        return null;
    }
}
