package app.fulfillment.web;

import app.fulfillment.api.ajax.CreateFulfillmentAJAXRequest;
import app.fulfillment.api.ajax.CreateFulfillmentAJAXResponse;
import app.fulfillment.api.ajax.FulfillmentAJAXWebService;
import app.fulfillment.api.ajax.FulfillmentStatusAJAXResponse;
import app.fulfillment.api.ajax.SearchFulfillmentAJAXRequest;
import app.fulfillment.api.ajax.SearchFulfillmentAJAXResponse;
import app.fulfillment.api.ajax.UpdateFulfillmentAJAXRequest;
import app.fulfillment.api.ajax.UpdateFulfillmentAJAXResponse;

/**
 * @author Cheffey
 */
public class FulfillmentAJAXWebServiceImpl implements FulfillmentAJAXWebService {
    @Override
    public UpdateFulfillmentAJAXResponse cancel(String id, UpdateFulfillmentAJAXRequest request) {
        return null;
    }

    @Override
    public SearchFulfillmentAJAXResponse search(SearchFulfillmentAJAXRequest request) {
        return null;
    }

    @Override
    public CreateFulfillmentAJAXResponse create(CreateFulfillmentAJAXRequest request) {
        return null;
    }

    @Override
    public FulfillmentStatusAJAXResponse getStatus(String id) {
        return null;
    }
}
