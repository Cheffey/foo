package app.order.fulfillment.web;

import app.order.api.BOFulfillmentAJAXWebService;
import app.order.api.fulfillment.BOCreateFulfillmentAJAXRequest;
import app.order.api.fulfillment.BOCreateFulfillmentAJAXResponse;
import app.order.api.fulfillment.BOFulfillmentStatusAJAXResponse;
import app.order.api.fulfillment.BOSearchFulfillmentAJAXRequest;
import app.order.api.fulfillment.BOSearchFulfillmentAJAXResponse;
import app.order.api.fulfillment.BOUpdateFulfillmentAJAXRequest;
import app.order.api.fulfillment.BOUpdateFulfillmentAJAXResponse;

/**
 * @author Cheffey
 */
public class BOFulfillmentAJAXWebServiceImpl implements BOFulfillmentAJAXWebService {
    @Override
    public BOUpdateFulfillmentAJAXResponse cancel(String id, BOUpdateFulfillmentAJAXRequest request) {
        return null;
    }

    @Override
    public BOSearchFulfillmentAJAXResponse search(BOSearchFulfillmentAJAXRequest request) {
        return null;
    }

    @Override
    public BOCreateFulfillmentAJAXResponse create(BOCreateFulfillmentAJAXRequest request) {
        return null;
    }

    @Override
    public BOFulfillmentStatusAJAXResponse getStatus(String id) {
        return null;
    }
}
