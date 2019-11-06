package app.customerservice.api;

import app.customerservice.api.fulfillment.ReadFulfillmentResponse;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;

/**
 * @author: Cheffey
 */
public interface FulfillmentWebService {
    @GET
    @Path("/fulfillment/:id")
    ReadFulfillmentResponse get(@PathParam("id") String id);
}
