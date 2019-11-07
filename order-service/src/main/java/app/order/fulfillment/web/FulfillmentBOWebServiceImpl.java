package app.order.fulfillment.web;

import app.order.fulfillment.service.FulfillmentService;
import app.order.api.FulfillmentBOWebService;
import app.order.api.fulfillment.ReadFulfillmentBOResponse;
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
