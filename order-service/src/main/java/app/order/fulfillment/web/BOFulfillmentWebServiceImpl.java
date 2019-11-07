package app.order.fulfillment.web;

import app.order.api.BOFulfillmentWebService;
import app.order.api.fulfillment.BOCreateFulfillmentRequest;
import app.order.api.fulfillment.BOCreateFulfillmentResponse;
import app.order.api.fulfillment.GetFulfillmentResponse;
import app.order.api.fulfillment.BOSearchFulfillmentRequest;
import app.order.api.fulfillment.BOSearchFulfillmentResponse;
import app.order.api.fulfillment.BOUpdateFulfillmentRequest;
import app.order.api.fulfillment.BOUpdateFulfillmentResponse;
import app.order.fulfillment.service.FulfillmentService;
import core.framework.inject.Inject;

/**
 * @author: Cheffey
 */
public class BOFulfillmentWebServiceImpl implements BOFulfillmentWebService {
    @Inject
    FulfillmentService fulfillmentService;

    @Override
    public BOUpdateFulfillmentResponse update(String id, BOUpdateFulfillmentRequest request) {
        return fulfillmentService.update(id, request);
    }

    @Override
    public BOSearchFulfillmentResponse search(BOSearchFulfillmentRequest request) {
        return fulfillmentService.search(request);
    }

    @Override
    public BOCreateFulfillmentResponse create(BOCreateFulfillmentRequest request) {
        return fulfillmentService.create(request);
    }

    @Override
    public GetFulfillmentResponse get(String id) {
        return fulfillmentService.get(id);
    }

    @Override
    public void delete(String id) {
        fulfillmentService.delete(id);
    }
}
