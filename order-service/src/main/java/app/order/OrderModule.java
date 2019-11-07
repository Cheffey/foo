package app.order;

import app.order.api.OrderAJAXWebService;
import app.order.api.OrderBOAJAXWebService;
import app.order.api.OrderBOWebService;
import app.order.api.OrderWebService;
import app.order.fulfillment.web.OrderAJAXWebServiceImpl;
import app.order.fulfillment.web.OrderBOAJAXWebServiceImpl;
import app.order.order.domain.Order;
import app.order.order.service.OrderService;
import app.order.order.web.OrderBOWebServiceImpl;
import app.order.order.web.OrderWebServiceImpl;
import core.framework.module.Module;

public class OrderModule extends Module {
    @Override
    protected void initialize() {
        db().repository(Order.class);
        bind(OrderService.class);
        api().service(OrderWebService.class, bind(OrderWebServiceImpl.class));
        api().service(OrderBOWebService.class, bind(OrderBOWebServiceImpl.class));
        api().service(OrderAJAXWebService.class, bind(OrderAJAXWebServiceImpl.class));
        api().service(OrderBOAJAXWebService.class, bind(OrderBOAJAXWebServiceImpl.class));
    }
}
