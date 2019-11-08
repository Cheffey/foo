package app;

import app.order.api.order.OrderAJAXWebService;
import app.order.api.OrderWebService;
import app.order.web.OrderAJAXWebServiceImpl;
import core.framework.module.Module;

/**
 * @author Cheffey
 */
public class OrderModule extends Module {
    @Override
    protected void initialize() {
        api().client(OrderWebService.class, requiredProperty("app.order.serviceURL"));
        api().service(OrderAJAXWebService.class, bind(OrderAJAXWebServiceImpl.class));
    }
}
