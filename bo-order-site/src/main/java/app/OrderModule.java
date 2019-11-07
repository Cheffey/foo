package app;

import app.order.api.OrderBOAJAXWebService;
import core.framework.module.Module;

/**
 * @author Cheffey
 */
public class OrderModule extends Module {
    @Override
    protected void initialize() {
        bind(OrderBOAJAXWebService.class);
    }
}
