package app.orderservice.fulfillment.web;

import app.orderservice.api.FulfillmentBOWebService;
import app.orderservice.api.fulfillment.ReadFulfillmentBOResponse;
import app.orderservice.fulfillment.service.FulfillmentService;
import core.framework.inject.Inject;

/**
 * @author: Cheffey
 */
public class FulfillmentBOWebServiceImpl implements FulfillmentBOWebService {
    @Inject
    FulfillmentService fulfillmentService;

    @Override
    public ReadFulfillmentBOResponse get(String id) {
        return null;
    }
}
