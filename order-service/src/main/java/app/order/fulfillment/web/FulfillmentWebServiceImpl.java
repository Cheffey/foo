package app.order.fulfillment.web;

import app.order.api.FulfillmentWebService;
import app.order.api.fulfillment.CancelFulfillmentResponse;
import app.order.api.fulfillment.CreateFulfillmentRequest;
import app.order.api.fulfillment.CreateFulfillmentResponse;
import app.order.api.fulfillment.FulfillmentStatusResponse;
import app.order.api.fulfillment.GetFulfillmentResponse;
import app.order.api.fulfillment.SearchFulfillmentRequest;
import app.order.api.fulfillment.SearchFulfillmentResponse;
import app.order.fulfillment.service.FulfillmentService;
import core.framework.inject.Inject;

/**
 * @author: Cheffey
 */
public class FulfillmentWebServiceImpl implements FulfillmentWebService {
    @Inject
    FulfillmentService fulfillmentService;

    @Override
    public GetFulfillmentResponse get(String id) {
        return null;
    }

    @Override
    public CancelFulfillmentResponse cancel(String id) {
        return null;
    }

    @Override
    public SearchFulfillmentResponse search(SearchFulfillmentRequest request) {
        return null;
    }

    @Override
    public CreateFulfillmentResponse create(CreateFulfillmentRequest request) {
        return null;
    }

    @Override
    public FulfillmentStatusResponse getStatus(String id) {
        return null;
    }
}
