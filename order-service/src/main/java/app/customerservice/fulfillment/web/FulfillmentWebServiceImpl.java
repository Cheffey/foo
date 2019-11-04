package app.customerservice.fulfillment.web;

import app.customerservice.api.FulfillmentWebService;
import app.customerservice.api.fulfillment.*;
import app.customerservice.fulfillment.service.FulfillmentService;
import core.framework.inject.Inject;

/**
 * @author: Cheffey
 */
public class FulfillmentWebServiceImpl implements FulfillmentWebService {
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
