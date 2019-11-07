package app.order.fulfillment.web;

import app.order.api.OrderBOAJAXWebService;
import app.order.api.order.CreateOrderBOAJAXRequest;
import app.order.api.order.CreateOrderBOAJAXResponse;
import app.order.api.order.OrderStatusBOAJAXResponse;
import app.order.api.order.SearchOrderBOAJAXRequest;
import app.order.api.order.SearchOrderBOAJAXResponse;
import app.order.api.order.UpdateOrderBOAJAXRequest;
import app.order.api.order.UpdateOrderBOAJAXResponse;
import app.order.order.service.OrderService;
import core.framework.inject.Inject;

/**
 * @author Cheffey
 */
public class OrderBOAJAXWebServiceImpl implements OrderBOAJAXWebService {
    @Inject
    OrderService orderService;

    @Override
    public UpdateOrderBOAJAXResponse cancel(String id, UpdateOrderBOAJAXRequest request) {
        return null;
    }

    @Override
    public SearchOrderBOAJAXResponse search(SearchOrderBOAJAXRequest request) {
        return orderService.search(request);
    }

    @Override
    public CreateOrderBOAJAXResponse create(CreateOrderBOAJAXRequest request) {
        return null;
    }

    @Override
    public OrderStatusBOAJAXResponse getStatus(String id) {
        return null;
    }
}
