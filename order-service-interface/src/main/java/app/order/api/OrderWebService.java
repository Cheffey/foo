package app.order.api;

import app.order.api.order.GetOrderResponse;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;

/**
 * @author: Cheffey
 */
public interface OrderWebService {
    @GET
    @Path("/bo/order/:id")
    GetOrderResponse get(@PathParam("id") String id);
}
