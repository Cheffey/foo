package app.order.fulfillment.web;

import app.order.api.OrderAJAXWebService;
import app.order.api.order.CreateOrderAJAXRequest;
import app.order.api.order.CreateOrderAJAXResponse;
import app.order.api.order.OrderStatusAJAXResponse;
import app.order.api.order.SearchOrderAJAXRequest;
import app.order.api.order.SearchOrderAJAXResponse;
import app.order.api.order.UpdateOrderAJAXRequest;
import app.order.api.order.UpdateOrderAJAXResponse;

/**
 * @author Cheffey
 */
public class OrderAJAXWebServiceImpl implements OrderAJAXWebService {
    @Override
    public UpdateOrderAJAXResponse cancel(String id, UpdateOrderAJAXRequest request) {
        return null;
    }

    @Override
    public SearchOrderAJAXResponse search(SearchOrderAJAXRequest request) {
        return null;
    }

    @Override
    public CreateOrderAJAXResponse create(CreateOrderAJAXRequest request) {
        return null;
    }

    @Override
    public OrderStatusAJAXResponse getStatus(String id) {
        return null;
    }
}
