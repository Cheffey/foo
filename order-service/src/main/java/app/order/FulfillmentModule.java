package app.order;

import app.order.api.BOFulfillmentWebService;
import app.order.api.FulfillmentWebService;
import app.order.fulfillment.domain.Fulfillment;
import app.order.fulfillment.service.FulfillmentService;
import app.order.fulfillment.web.BOFulfillmentWebServiceImpl;
import app.order.fulfillment.web.FulfillmentWebServiceImpl;
import core.framework.module.Module;
import core.framework.mongo.module.MongoConfig;

public class FulfillmentModule extends Module {
    @Override
    protected void initialize() {
        MongoConfig mongoConfig = config(MongoConfig.class);
        mongoConfig.uri("mongodb://localhost:27017/test");
        mongoConfig.collection(Fulfillment.class);

        bind(FulfillmentService.class);
        api().service(BOFulfillmentWebService.class, bind(BOFulfillmentWebServiceImpl.class));
        api().service(FulfillmentWebService.class, bind(FulfillmentWebServiceImpl.class));
    }
}
