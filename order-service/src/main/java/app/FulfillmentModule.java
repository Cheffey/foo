package app;

import app.customerservice.api.FulfillmentWebService;
import app.customerservice.fulfillment.domain.Fulfillment;
import app.customerservice.fulfillment.service.FulfillmentService;
import app.customerservice.fulfillment.web.FulfillmentWebServiceImpl;
import core.framework.module.Module;
import core.framework.mongo.module.MongoConfig;

public class FulfillmentModule extends Module {
    @Override
    protected void initialize() {
        MongoConfig mongoConfig = config(MongoConfig.class);
        mongoConfig.uri("mongodb://localhost:27017/test");
        mongoConfig.collection(Fulfillment.class);

        bind(FulfillmentService.class);
        api().service(FulfillmentWebService.class, bind(FulfillmentWebServiceImpl.class));
    }
}
