package app.order.api;

import app.order.api.order.ReadOrderBOResponse;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;

/**
 * @author: Cheffey
 */
public interface OrderBOWebService {
    @GET
    @Path("/bo/order/:id")
    ReadOrderBOResponse get(@PathParam("id") String id);
}
