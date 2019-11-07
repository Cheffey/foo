package app.web;

import app.order.api.BOFulfillmentAJAXWebService;
import app.order.api.fulfillment.BOCreateFulfillmentRequest;
import app.order.api.fulfillment.BOCreateFulfillmentResponse;
import app.order.api.fulfillment.BOSearchFulfillmentRequest;
import app.order.api.fulfillment.BOSearchFulfillmentResponse;
import app.order.api.fulfillment.BOUpdateFulfillmentRequest;
import app.order.api.fulfillment.BOUpdateFulfillmentResponse;
import app.order.api.fulfillment.GetFulfillmentResponse;

/**
 * @author Cheffey
 */
public class BOFulfillmentAJAXWebServiceImpl implements BOFulfillmentAJAXWebService {
    @Override
    public BOUpdateFulfillmentResponse update(String id, BOUpdateFulfillmentRequest request) {
        return null;
    }

    @Override
    public BOSearchFulfillmentResponse search(BOSearchFulfillmentRequest request) {
        return null;
    }

    @Override
    public BOCreateFulfillmentResponse create(BOCreateFulfillmentRequest request) {
        return null;
    }

    @Override
    public GetFulfillmentResponse get(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}