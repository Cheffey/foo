package app;

import app.order.api.BOOrderAJAXWebService;
import app.order.api.BOOrderWebService;
import core.framework.module.Module;

/**
 * @author Cheffey
 */
public class OrderModule extends Module {
    @Override
    protected void initialize() {
        api().client(BOOrderWebService.class, requiredProperty("app.order.service.URL"));
        api().client(BOOrderAJAXWebService.class, requiredProperty("app.order.service.URL"));
    }
}
