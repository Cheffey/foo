package app.orderservice.api;

import app.orderservice.api.order.ReadOrderBOResponse;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;

/**
 * @author: Cheffey
 */
public interface OrderBOWebService {
    @GET
    @Path("/order/:id")
    ReadOrderBOResponse get(@PathParam("id") String id);
}
