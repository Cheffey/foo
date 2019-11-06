package app.customerservice.order.web;

import app.customerservice.api.OrderWebService;
import app.customerservice.api.order.ReadOrderResponse;
import app.customerservice.order.service.OrderService;
import core.framework.inject.Inject;

/**
 * @author: Cheffey
 */
public class OrderWebServiceImpl implements OrderWebService {
    @Inject
    OrderService orderService;
    @Override
    public ReadOrderResponse get(String id) {
        return orderService.get(id);
    }
}
