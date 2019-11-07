package app;

import app.order.api.OrderAJAXWebService;
import app.order.api.OrderWebService;
import core.framework.module.App;

/**
 * @author Cheffey
 */
public class WebsiteApp extends App {

    @Override
    protected void initialize() {
        http().httpPort(80);
        http().httpsPort(443);
        api().client(OrderWebService.class, "http://localhost:4080/");
        api().client(OrderAJAXWebService.class, "http://localhost:4080/");
        //load(new SystemModule("sys.properties"));
    }
}
