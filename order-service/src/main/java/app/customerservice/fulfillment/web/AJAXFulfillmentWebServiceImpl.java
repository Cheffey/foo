package app.customerservice.fulfillment.web;

import app.customerservice.api.AJAXFulfillmentWebService;
import app.customerservice.api.fulfillment.*;
import app.customerservice.fulfillment.service.FulfillmentService;
import core.framework.inject.Inject;

/**
 * @author: Cheffey
 */
public class AJAXFulfillmentWebServiceImpl implements AJAXFulfillmentWebService{
    @Inject
    FulfillmentService fulfillmentService;

    @Override
    public UpdateFulfillmentResponse update(String id, UpdateFulfillmentRequest request) {
        return fulfillmentService.update(id, request);
    }

    @Override
    public CreateFulfillmentResponse create(CreateFulfillmentRequest request) {
        return fulfillmentService.create(request);
    }

    @Override
    public ReadFulfillmentResponse read(String id) {
        return fulfillmentService.read(id);
    }

    @Override
    public void delete(String id) {
        fulfillmentService.delete(id);
    }
}
