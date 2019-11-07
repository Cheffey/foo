package app.order;

import app.order.api.BOOrderWebService;
import app.order.api.OrderWebService;
import app.order.order.domain.Order;
import app.order.order.service.OrderService;
import app.order.order.web.BOOrderWebServiceImpl;
import app.order.order.web.OrderWebServiceImpl;
import core.framework.module.Module;

public class OrderModule extends Module {
    @Override
    protected void initialize() {
        db().repository(Order.class);
        bind(OrderService.class);
        api().service(BOOrderWebService.class, bind(BOOrderWebServiceImpl.class));
        api().service(OrderWebService.class, bind(OrderWebServiceImpl.class));
    }
}
