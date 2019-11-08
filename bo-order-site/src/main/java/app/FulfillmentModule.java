package app;

import app.order.api.BOFulfillmentWebService;
import app.order.api.fulfillment.BOFulfillmentAJAXWebService;
import app.order.web.BOFulfillmentAJAXWebServiceImpl;
import core.framework.module.Module;

/**
 * @author Cheffey
 */
public class FulfillmentModule extends Module {
    @Override
    protected void initialize() {
        api().client(BOFulfillmentWebService.class, requiredProperty("app.order.serviceURL"));
        api().service(BOFulfillmentAJAXWebService.class, bind(BOFulfillmentAJAXWebServiceImpl.class));
        }
}
