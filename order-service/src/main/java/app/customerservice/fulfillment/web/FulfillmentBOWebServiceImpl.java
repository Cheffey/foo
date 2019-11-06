package app.customerservice.fulfillment.web;

import app.customerservice.api.FulfillmentBOWebService;
import app.customerservice.api.fulfillment.CreateFulfillmentRequest;
import app.customerservice.api.fulfillment.CreateFulfillmentResponse;
import app.customerservice.api.fulfillment.ReadFulfillmentResponse;
import app.customerservice.api.fulfillment.SearchFulfillmentRequest;
import app.customerservice.api.fulfillment.SearchFulfillmentResponse;
import app.customerservice.api.fulfillment.UpdateFulfillmentRequest;
import app.customerservice.api.fulfillment.UpdateFulfillmentResponse;
import app.customerservice.fulfillment.service.FulfillmentService;
import core.framework.inject.Inject;

/**
 * @author: Cheffey
 */
public class FulfillmentBOWebServiceImpl implements FulfillmentBOWebService {
    @Inject
    FulfillmentService fulfillmentService;

    @Override
    public UpdateFulfillmentResponse update(String id, UpdateFulfillmentRequest request) {
        return fulfillmentService.update(id, request);
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
    public ReadFulfillmentResponse get(String id) {
        return fulfillmentService.get(id);
    }

    @Override
    public void delete(String id) {
        fulfillmentService.delete(id);
    }
}
