package app;

import app.order.api.BOOrderWebService;
import app.order.api.order.BOOrderAJAXWebService;
import app.order.web.BOOrderAJAXWebServiceImpl;
import core.framework.module.Module;

/**
 * @author Cheffey
 */
public class OrderModule extends Module {
    @Override
    protected void initialize() {
        api().client(BOOrderWebService.class, requiredProperty("app.order.serviceURL"));
        api().service(BOOrderAJAXWebService.class, bind(BOOrderAJAXWebServiceImpl.class));
        }
}
