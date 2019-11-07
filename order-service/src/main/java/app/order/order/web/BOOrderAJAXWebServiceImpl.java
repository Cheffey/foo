package app.order.order.web;

import app.order.api.BOOrderAJAXWebService;
import app.order.api.order.BOCreateOrderAJAXRequest;
import app.order.api.order.BOCreateOrderAJAXResponse;
import app.order.api.order.BOOrderStatusAJAXResponse;
import app.order.api.order.BOSearchOrderAJAXRequest;
import app.order.api.order.BOSearchOrderAJAXResponse;
import app.order.api.order.BOUpdateOrderAJAXRequest;
import app.order.api.order.BOUpdateOrderAJAXResponse;
import app.order.order.service.OrderService;
import core.framework.inject.Inject;

/**
 * @author Cheffey
 */
public class BOOrderAJAXWebServiceImpl implements BOOrderAJAXWebService {
    @Inject
    OrderService orderService;

    @Override
    public BOUpdateOrderAJAXResponse cancel(String id, BOUpdateOrderAJAXRequest request) {
        return null;
    }

    @Override
    public BOSearchOrderAJAXResponse search(BOSearchOrderAJAXRequest request) {
        return orderService.search(request);
    }

    @Override
    public BOCreateOrderAJAXResponse create(BOCreateOrderAJAXRequest request) {
        return null;
    }

    @Override
    public BOOrderStatusAJAXResponse getStatus(String id) {
        return null;
    }
}
