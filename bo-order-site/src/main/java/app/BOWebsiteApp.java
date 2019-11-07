package app;

import app.order.api.OrderBOAJAXWebService;
import app.order.api.OrderBOWebService;
import core.framework.module.App;

/**
 * @author Cheffey
 */
public class BOWebsiteApp extends App {

    @Override
    protected void initialize() {
        http().httpPort(8080);
        http().httpsPort(8443);
        api().client(OrderBOWebService.class, "http://localhost:4080/");
        api().client(OrderBOAJAXWebService.class, "http://localhost:4080/");
        load(new WebModule());
    }
}
