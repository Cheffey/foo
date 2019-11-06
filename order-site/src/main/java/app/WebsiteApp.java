package app;

import core.framework.module.App;
import core.framework.module.SystemModule;

/**
 * @author Cheffey
 */
public class WebsiteApp extends App {

    @Override
    protected void initialize() {
        http().httpPort(80);
        http().httpsPort(443);
        load(new SystemModule("sys.properties"));
        load(new FulfillmentModule());
        load(new OrderModule());
    }
}
