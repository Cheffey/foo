package app;

import app.orderservice.api.OrderWebService;
import app.orderservice.order.domain.Order;
import app.orderservice.order.service.OrderService;
import app.orderservice.order.web.OrderWebServiceImpl;
import core.framework.module.Module;

public class OrderModule extends Module {
    @Override
    protected void initialize() {
        db().repository(Order.class);

        bind(OrderService.class);
        api().service(OrderWebService.class, bind(OrderWebServiceImpl.class));
    }
}
