package app.orderservice.api;

import app.orderservice.api.fulfillment.ReadFulfillmentBOResponse;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;

/**
 * @author: Cheffey
 */
public interface FulfillmentBOWebService {
    @GET
    @Path("/fulfillment/:id")
    ReadFulfillmentBOResponse get(@PathParam("id") String id);
}
