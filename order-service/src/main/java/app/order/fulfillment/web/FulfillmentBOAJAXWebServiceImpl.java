package app.order.fulfillment.web;

import app.order.api.FulfillmentBOAJAXWebService;
import app.order.api.fulfillment.CreateFulfillmentBOAJAXRequest;
import app.order.api.fulfillment.CreateFulfillmentBOAJAXResponse;
import app.order.api.fulfillment.FulfillmentStatusBOAJAXResponse;
import app.order.api.fulfillment.SearchFulfillmentBOAJAXRequest;
import app.order.api.fulfillment.SearchFulfillmentBOAJAXResponse;
import app.order.api.fulfillment.UpdateFulfillmentBOAJAXRequest;
import app.order.api.fulfillment.UpdateFulfillmentBOAJAXResponse;

/**
 * @author Cheffey
 */
public class FulfillmentBOAJAXWebServiceImpl implements FulfillmentBOAJAXWebService {
    @Override
    public UpdateFulfillmentBOAJAXResponse cancel(String id, UpdateFulfillmentBOAJAXRequest request) {
        return null;
    }

    @Override
    public SearchFulfillmentBOAJAXResponse search(SearchFulfillmentBOAJAXRequest request) {
        return null;
    }

    @Override
    public CreateFulfillmentBOAJAXResponse create(CreateFulfillmentBOAJAXRequest request) {
        return null;
    }

    @Override
    public FulfillmentStatusBOAJAXResponse getStatus(String id) {
        return null;
    }
}
