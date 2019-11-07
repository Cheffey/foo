package app.order.api;

import app.order.api.fulfillment.ReadFulfillmentBOResponse;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;

/**
 * @author: Cheffey
 */
public interface FulfillmentBOWebService {
    @GET
    @Path("/bo/fulfillment/:id")
    ReadFulfillmentBOResponse get(@PathParam("id") String id);
}
