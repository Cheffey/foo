package app.order.service;

import app.order.api.ajax.CreateOrderAJAXRequest;
import app.order.api.ajax.CreateOrderAJAXResponse;
import app.order.api.ajax.OrderAJAXWebService;
import app.order.api.ajax.OrderStatusAJAXResponse;
import app.order.api.ajax.SearchOrderAJAXRequest;
import app.order.api.ajax.SearchOrderAJAXResponse;
import app.order.api.ajax.UpdateOrderAJAXRequest;
import app.order.api.ajax.UpdateOrderAJAXResponse;

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
