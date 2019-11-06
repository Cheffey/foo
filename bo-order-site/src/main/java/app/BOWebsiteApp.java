package app;

import core.framework.module.App;
import core.framework.module.SystemModule;

/**
 * @author Cheffey
 */
public class BOWebsiteApp extends App {

    @Override
    protected void initialize() {
        http().httpPort(8080);
        http().httpsPort(8443);
        load(new SystemModule("sys.properties"));
        load(new FulfillmentModule());
        load(new OrderModule());
    }
}
