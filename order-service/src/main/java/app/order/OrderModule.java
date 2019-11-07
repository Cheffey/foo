package app.order;

import app.order.api.OrderAJAXWebService;
import app.order.api.BOOrderAJAXWebService;
import app.order.api.OrderWebService;
import app.order.api.BOOrderWebService;
import app.order.order.web.OrderAJAXWebServiceImpl;
import app.order.order.web.BOOrderAJAXWebServiceImpl;
import app.order.order.domain.Order;
import app.order.order.service.OrderService;
import app.order.order.web.OrderWebServiceImpl;
import app.order.order.web.BOOrderWebServiceImpl;
import core.framework.module.Module;

public class OrderModule extends Module {
    @Override
    protected void initialize() {
        db().repository(Order.class);
        bind(OrderService.class);
        api().service(BOOrderWebService.class, bind(BOOrderWebServiceImpl.class));
        api().service(OrderWebService.class, bind(OrderWebServiceImpl.class));
        api().service(OrderAJAXWebService.class, bind(OrderAJAXWebServiceImpl.class));
        api().service(BOOrderAJAXWebService.class, bind(BOOrderAJAXWebServiceImpl.class));
    }
}
