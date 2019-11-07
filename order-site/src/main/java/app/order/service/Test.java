package app.order.service;

import app.order.api.OrderWebService;
import app.order.api.order.CreateOrderRequest;
import core.framework.inject.Inject;

/**
 * @author Cheffey
 */
public class Test {
    @Inject
    OrderWebService orderWebService;

    public void test() {
        orderWebService.create(new CreateOrderRequest());
    }
}
