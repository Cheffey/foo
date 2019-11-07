package app;

import app.order.api.OrderAJAXWebService;
import app.order.api.OrderWebService;
import core.framework.module.Module;

/**
 * @author Cheffey
 */
public class OrderModule extends Module {
    @Override
    protected void initialize() {
        api().client(OrderWebService.class, requiredProperty("app.order.service.URL"));
        api().client(OrderAJAXWebService.class, requiredProperty("app.order.service.URL"));
    }
}
