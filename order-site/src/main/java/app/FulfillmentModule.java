package app;

import app.order.api.FulfillmentAJAXWebService;
import app.order.api.FulfillmentWebService;
import core.framework.module.Module;

/**
 * @author Cheffey
 */
public class FulfillmentModule extends Module {
    @Override
    protected void initialize() {
        api().client(FulfillmentWebService.class, requiredProperty("app.order.service.URL"));
        api().client(FulfillmentAJAXWebService.class, requiredProperty("app.order.service.URL"));
    }
}
