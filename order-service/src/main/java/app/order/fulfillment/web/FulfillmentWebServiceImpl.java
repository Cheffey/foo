package app.order.fulfillment.web;

import app.order.api.FulfillmentWebService;
import app.order.api.fulfillment.CreateFulfillmentRequest;
import app.order.api.fulfillment.CreateFulfillmentResponse;
import app.order.api.fulfillment.ReadFulfillmentResponse;
import app.order.api.fulfillment.SearchFulfillmentRequest;
import app.order.api.fulfillment.SearchFulfillmentResponse;
import app.order.api.fulfillment.UpdateFulfillmentRequest;
import app.order.api.fulfillment.UpdateFulfillmentResponse;
import app.order.fulfillment.service.FulfillmentService;
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
