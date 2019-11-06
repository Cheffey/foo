package app.orderservice.fulfillment.web;

import app.orderservice.api.FulfillmentWebService;
import app.orderservice.api.fulfillment.CreateFulfillmentRequest;
import app.orderservice.api.fulfillment.CreateFulfillmentResponse;
import app.orderservice.api.fulfillment.ReadFulfillmentResponse;
import app.orderservice.api.fulfillment.SearchFulfillmentRequest;
import app.orderservice.api.fulfillment.SearchFulfillmentResponse;
import app.orderservice.api.fulfillment.UpdateFulfillmentRequest;
import app.orderservice.api.fulfillment.UpdateFulfillmentResponse;
import app.orderservice.fulfillment.service.FulfillmentService;
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
