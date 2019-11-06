package app;

import app.orderservice.api.FulfillmentBOWebService;
import app.orderservice.fulfillment.domain.Fulfillment;
import app.orderservice.fulfillment.service.FulfillmentService;
import app.orderservice.fulfillment.web.FulfillmentBOWebServiceImpl;
import core.framework.module.Module;
import core.framework.mongo.module.MongoConfig;

public class FulfillmentModule extends Module {
    @Override
    protected void initialize() {
        MongoConfig mongoConfig = config(MongoConfig.class);
        mongoConfig.uri("mongodb://localhost:27017/test");
        mongoConfig.collection(Fulfillment.class);

        bind(FulfillmentService.class);
        api().service(FulfillmentBOWebService.class, bind(FulfillmentBOWebServiceImpl.class));
    }
}
