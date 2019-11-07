package app.order;

import app.order.api.FulfillmentAJAXWebService;
import app.order.api.FulfillmentBOAJAXWebService;
import app.order.api.FulfillmentBOWebService;
import app.order.api.FulfillmentWebService;
import app.order.fulfillment.domain.Fulfillment;
import app.order.fulfillment.service.FulfillmentService;
import app.order.fulfillment.web.FulfillmentAJAXWebServiceImpl;
import app.order.fulfillment.web.FulfillmentBOAJAXWebServiceImpl;
import app.order.fulfillment.web.FulfillmentBOWebServiceImpl;
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
        api().service(FulfillmentWebService.class, bind(FulfillmentWebServiceImpl.class));
        api().service(FulfillmentBOWebService.class, bind(FulfillmentBOWebServiceImpl.class));
        api().service(FulfillmentAJAXWebService.class, bind(FulfillmentAJAXWebServiceImpl.class));
        api().service(FulfillmentBOAJAXWebService.class, bind(FulfillmentBOAJAXWebServiceImpl.class));
    }
}
