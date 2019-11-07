package app.order.order.web;

import app.order.order.service.OrderService;
import app.order.api.OrderBOWebService;
import app.order.api.order.ReadOrderBOResponse;
import core.framework.inject.Inject;

/**
 * @author: Cheffey
 */
public class OrderBOWebServiceImpl implements OrderBOWebService {
    @Inject
    OrderService orderService;

    @Override
    public ReadOrderBOResponse get(String id) {
        return null;
    }
}
