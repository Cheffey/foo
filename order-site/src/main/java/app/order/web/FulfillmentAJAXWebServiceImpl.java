package app.order.web;

import app.order.api.FulfillmentAJAXWebService;
import app.order.api.FulfillmentWebService;
import app.order.api.fulfillment.CancelFulfillmentResponse;
import app.order.api.fulfillment.CreateFulfillmentRequest;
import app.order.api.fulfillment.CreateFulfillmentResponse;
import app.order.api.fulfillment.FulfillmentStatusResponse;
import app.order.api.fulfillment.GetFulfillmentResponse;
import app.order.api.fulfillment.SearchFulfillmentRequest;
import app.order.api.fulfillment.SearchFulfillmentResponse;
import core.framework.inject.Inject;

/**
 * @author Cheffey
 */
public class FulfillmentAJAXWebServiceImpl implements FulfillmentAJAXWebService {
    @Inject
    FulfillmentWebService fulfillmentWebService;

    @Override
    public GetFulfillmentResponse get(String id) {
        return fulfillmentWebService.get(id);
    }

    @Override
    public CancelFulfillmentResponse cancel(String id) {
        return fulfillmentWebService.cancel(id);
    }

    @Override
    public SearchFulfillmentResponse search(SearchFulfillmentRequest request) {
        return fulfillmentWebService.search(request);
    }

    @Override
    public CreateFulfillmentResponse create(CreateFulfillmentRequest request) {
        return fulfillmentWebService.create(request);
    }

    @Override
    public FulfillmentStatusResponse getStatus(String id) {
        return fulfillmentWebService.getStatus(id);
    }
}
