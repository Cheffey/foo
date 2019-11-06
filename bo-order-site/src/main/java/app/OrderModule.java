package app;

import app.orderservice.api.OrderBOWebService;
import app.orderservice.order.domain.Order;
import app.orderservice.order.service.OrderService;
import app.orderservice.order.web.OrderBOWebServiceImpl;
import core.framework.module.Module;

public class OrderModule extends Module {
    @Override
    protected void initialize() {
        db().repository(Order.class);

        bind(OrderService.class);
        api().service(OrderBOWebService.class, bind(OrderBOWebServiceImpl.class));
    }
}
