package app;

import app.order.api.OrderAJAXWebService;
import app.order.api.BOOrderWebService;
import core.framework.module.App;

/**
 * @author Cheffey
 */
public class OrderSiteApp extends App {

    @Override
    protected void initialize() {
        http().httpPort(80);
        http().httpsPort(443);
        api().client(BOOrderWebService.class, "http://localhost:4080/");
        api().client(OrderAJAXWebService.class, "http://localhost:4080/");
        //load(new SystemModule("sys.properties"));
    }
}
