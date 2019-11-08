package app;

import core.framework.module.App;
import core.framework.module.SystemModule;

/**
 * @author Cheffey
 */
public class BOOrderSiteApp extends App {

    @Override
    protected void initialize() {
        loadProperties("app.properties");
        load(new SystemModule("sys.properties"));
        load(new FulfillmentModule());
        load(new OrderModule());
        load(new WebModule());
    }
}
