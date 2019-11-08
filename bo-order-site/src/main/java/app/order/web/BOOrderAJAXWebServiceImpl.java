package app.order.web;

import app.order.api.BOOrderAJAXWebService;
import app.order.api.order.BOCreateOrderRequest;
import app.order.api.order.BOCreateOrderResponse;
import app.order.api.order.BOSearchOrderRequest;
import app.order.api.order.BOSearchOrderResponse;
import app.order.api.order.BOUpdateOrderRequest;
import app.order.api.order.BOUpdateOrderResponse;
import app.order.api.order.GetOrderResponse;

/**
 * @author Cheffey
 */
public class BOOrderAJAXWebServiceImpl implements BOOrderAJAXWebService {
    @Override
    public BOUpdateOrderResponse update(String id, BOUpdateOrderRequest request) {
        return null;
    }

    @Override
    public BOSearchOrderResponse search(BOSearchOrderRequest request) {
        return null;
    }

    @Override
    public BOCreateOrderResponse create(BOCreateOrderRequest request) {
        return null;
    }

    @Override
    public GetOrderResponse get(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
