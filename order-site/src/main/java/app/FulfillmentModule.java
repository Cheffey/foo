package app;

import app.order.api.FulfillmentAJAXWebService;
import app.order.api.FulfillmentWebService;
import app.order.web.FulfillmentAJAXWebServiceImpl;
import core.framework.module.Module;

/**
 * @author Cheffey
 */
public class FulfillmentModule extends Module {
    @Override
    protected void initialize() {
        api().client(FulfillmentWebService.class, requiredProperty("app.order.serviceURL"));
        api().service(FulfillmentAJAXWebService.class, bind(FulfillmentAJAXWebServiceImpl.class));
    }
}
