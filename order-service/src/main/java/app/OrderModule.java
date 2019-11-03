package app;

import app.customerservice.api.AJAXFulfillmentWebService;
import app.customerservice.api.AJAXOrderWebService;
import app.customerservice.api.fulfillment.CreateFulfillmentRequest;
import app.customerservice.api.order.CreateOrderRequest;
import app.customerservice.fulfillment.domain.Fulfillment;
import app.customerservice.fulfillment.service.FulfillmentService;
import app.customerservice.fulfillment.web.AJAXFulfillmentWebServiceImpl;
import app.customerservice.order.domain.Order;
import app.customerservice.order.service.OrderService;
import app.customerservice.order.web.AJAXOrderWebServiceImpl;
import core.framework.module.Module;
import core.framework.mongo.module.MongoConfig;

public class OrderModule extends Module {
    @Override
    protected void initialize() {
        db().repository(Order.class);

        bind(OrderService.class);
        api().service(AJAXOrderWebService.class, bind(AJAXOrderWebServiceImpl.class));
    }
}
