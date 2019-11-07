package app.order.fulfillment.web;

import app.order.api.FulfillmentWebService;
import app.order.api.fulfillment.GetFulfillmentResponse;
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
}
