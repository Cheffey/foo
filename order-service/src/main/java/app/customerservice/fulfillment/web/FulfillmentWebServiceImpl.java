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
    public ReadFulfillmentResponse get(String id) {
        return fulfillmentService.get(id);
    }
}
