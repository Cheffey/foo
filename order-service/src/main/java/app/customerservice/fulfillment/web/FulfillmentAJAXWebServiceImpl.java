package app.customerservice.fulfillment.web;

import app.customerservice.api.FulfillmentAJAXWebService;
import app.customerservice.api.fulfillment.CreateFulfillmentRequest;
import app.customerservice.api.fulfillment.CreateFulfillmentResponse;
import app.customerservice.api.fulfillment.FulfillmentStatusResponse;
import app.customerservice.api.fulfillment.SearchFulfillmentRequest;
import app.customerservice.api.fulfillment.SearchFulfillmentResponse;
import app.customerservice.api.fulfillment.UpdateFulfillmentRequest;
import app.customerservice.api.fulfillment.UpdateFulfillmentResponse;
import app.customerservice.fulfillment.service.FulfillmentService;
import core.framework.inject.Inject;

/**
 * @author: Cheffey
 */
public class FulfillmentAJAXWebServiceImpl implements FulfillmentAJAXWebService {
    @Inject
    FulfillmentService fulfillmentService;

    @Override
    public UpdateFulfillmentResponse cancel(String id, UpdateFulfillmentRequest request) {
        return fulfillmentService.cancel(request);
    }

    @Override
    public SearchFulfillmentResponse search(SearchFulfillmentRequest request) {
        return fulfillmentService.search(request);
    }

    @Override
    public CreateFulfillmentResponse create(CreateFulfillmentRequest request) {
        return fulfillmentService.create(request);
    }

    @Override
    public FulfillmentStatusResponse getStatus(String id) {
        return fulfillmentService.getStatus(id);
    }
}
