package app.orderservice.order.web;

import app.orderservice.api.OrderBOWebService;
import app.orderservice.api.order.ReadOrderBOResponse;
import app.orderservice.order.service.OrderService;
import core.framework.inject.Inject;

/**
 * @author: Cheffey
 */
public class OrderBOWebServiceImpl implements OrderBOWebService {
    @Inject
    OrderService orderService;

    @Override
    public ReadOrderBOResponse get(String id) {
        return null;
    }
}
