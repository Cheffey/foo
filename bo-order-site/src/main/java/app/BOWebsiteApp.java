package app;

import app.order.api.OrderBOAJAXWebService;
import app.order.api.OrderBOWebService;
import core.framework.module.App;
import core.framework.module.SystemModule;
import core.framework.util.Properties;

/**
 * @author Cheffey
 */
public class BOWebsiteApp extends App {

    @Override
    protected void initialize() {
        var properties = new Properties();
        properties.load("app.properities");
        load(new SystemModule("sys.properties"));
        String url = properties.get("order-service-url").orElseThrow();
        api().client(OrderBOWebService.class, url);
        api().client(OrderBOAJAXWebService.class, url);
        load(new WebModule());
    }
}
