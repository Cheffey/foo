package app.order;

import core.framework.module.App;
import core.framework.module.SystemModule;

public class OrderServiceApp extends App {
    @Override
    protected void initialize() {
        http().httpPort(4080);
        http().httpsPort(4443);
        load(new SystemModule("sys.properties"));
        load(new FulfillmentModule());
        load(new OrderModule());
    }
}
