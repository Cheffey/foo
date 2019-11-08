package app.order.web;

import app.order.api.order.BOCreateOrderAJAXRequest;
import app.order.api.order.BOCreateOrderAJAXResponse;
import app.order.api.order.BOGetOrderAJAXResponse;
import app.order.api.BOOrderAJAXWebService;
import app.order.api.order.BOSearchOrderAJAXRequest;
import app.order.api.order.BOSearchOrderAJAXResponse;
import app.order.api.order.BOUpdateOrderAJAXRequest;
import app.order.api.order.BOUpdateOrderAJAXResponse;

/**
 * @author Cheffey
 */
public class BOOrderAJAXWebServiceImpl implements BOOrderAJAXWebService {
    @Override
    public BOUpdateOrderAJAXResponse update(String id, BOUpdateOrderAJAXRequest request) {
        return null;
    }

    @Override
    public BOSearchOrderAJAXResponse search(BOSearchOrderAJAXRequest request) {
        return null;
    }

    @Override
    public BOCreateOrderAJAXResponse create(BOCreateOrderAJAXRequest request) {
        return null;
    }

    @Override
    public BOGetOrderAJAXResponse get(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
