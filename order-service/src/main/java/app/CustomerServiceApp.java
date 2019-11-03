package app;

import app.OrderModule;
import core.framework.module.App;
import core.framework.module.SystemModule;

public class CustomerServiceApp extends App {
    @Override
    protected void initialize() {
        http().httpPort(80);
        http().httpsPort(443);
        load(new SystemModule("sys.properties"));
        load(new OrderModule());
        load(new FulfillmentModule());
    }
}
