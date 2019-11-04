package app;

import app.customerservice.api.OrderWebService;
import app.customerservice.order.domain.Order;
import app.customerservice.order.service.OrderService;
import app.customerservice.order.web.OrderWebServiceImpl;
import core.framework.module.Module;

public class OrderModule extends Module {
    @Override
    protected void initialize() {
        db().repository(Order.class);

        bind(OrderService.class);
        api().service(OrderWebService.class, bind(OrderWebServiceImpl.class));
    }
}
