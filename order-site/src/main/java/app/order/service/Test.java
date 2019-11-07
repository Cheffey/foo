package app.order.service;

import app.order.api.BOOrderWebService;
import app.order.api.order.BOCreateOrderRequest;
import core.framework.inject.Inject;

/**
 * @author Cheffey
 */
public class Test {
    @Inject
    BOOrderWebService BOOrderWebService;

    public void test() {
        BOOrderWebService.create(new BOCreateOrderRequest());
    }
}
