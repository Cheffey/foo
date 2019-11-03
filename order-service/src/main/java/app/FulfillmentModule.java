package app;

import app.customerservice.api.AJAXFulfillmentWebService;
import app.customerservice.api.AJAXOrderWebService;
import app.customerservice.fulfillment.domain.Fulfillment;
import app.customerservice.fulfillment.service.FulfillmentService;
import app.customerservice.fulfillment.web.AJAXFulfillmentWebServiceImpl;
import app.customerservice.order.domain.Order;
import app.customerservice.order.service.OrderService;
import app.customerservice.order.web.AJAXOrderWebServiceImpl;
import core.framework.module.Module;
import core.framework.mongo.module.MongoConfig;

public class FulfillmentModule extends Module {
    @Override
    protected void initialize() {
        MongoConfig mongoConfig = config(MongoConfig.class);
        mongoConfig.uri("mongodb://localhost:27017/test");
        mongoConfig.collection(Fulfillment.class);

        bind(FulfillmentService.class);
        api().service(AJAXFulfillmentWebService.class, bind(AJAXFulfillmentWebServiceImpl.class));
    }
}
