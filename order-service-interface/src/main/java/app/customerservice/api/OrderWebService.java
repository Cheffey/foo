package app.customerservice.api;

import app.customerservice.api.order.ReadOrderResponse;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;

/**
 * @author: Cheffey
 */
public interface OrderWebService {
    @GET
    @Path("/order/:id")
    ReadOrderResponse get(@PathParam("id")String id);
}
