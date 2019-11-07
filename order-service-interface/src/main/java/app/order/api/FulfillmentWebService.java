package app.order.api;

import app.order.api.fulfillment.GetFulfillmentResponse;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;

/**
 * @author: Cheffey
 */
public interface FulfillmentWebService {
    @GET
    @Path("/bo/fulfillment/:id")
    GetFulfillmentResponse get(@PathParam("id") String id);
}
