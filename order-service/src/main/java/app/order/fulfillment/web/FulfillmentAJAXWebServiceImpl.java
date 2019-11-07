package app.order.fulfillment.web;

import app.order.api.FulfillmentAJAXWebService;
import app.order.api.fulfillment.CreateFulfillmentAJAXRequest;
import app.order.api.fulfillment.CreateFulfillmentAJAXResponse;
import app.order.api.fulfillment.FulfillmentStatusAJAXResponse;
import app.order.api.fulfillment.SearchFulfillmentAJAXRequest;
import app.order.api.fulfillment.SearchFulfillmentAJAXResponse;
import app.order.api.fulfillment.UpdateFulfillmentAJAXRequest;
import app.order.api.fulfillment.UpdateFulfillmentAJAXResponse;

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
