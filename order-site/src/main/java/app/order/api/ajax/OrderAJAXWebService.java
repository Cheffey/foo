package app.order.api.ajax;

import core.framework.api.http.HTTPStatus;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.POST;
import core.framework.api.web.service.PUT;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;
import core.framework.api.web.service.ResponseStatus;

/**
 * @author: Cheffey
 */
public interface OrderAJAXWebService {
    @PUT
    @Path("/ajax/order/:id/cancel")
    UpdateOrderAJAXResponse cancel(@PathParam("id") String id, UpdateOrderAJAXRequest request);

    @PUT
    @Path("/ajax/order")
    SearchOrderAJAXResponse search(SearchOrderAJAXRequest request);

    @POST
    @Path("/ajax/order")
    @ResponseStatus(HTTPStatus.CREATED)
    CreateOrderAJAXResponse create(CreateOrderAJAXRequest request);

    @GET
    @Path("/ajax/order/:id")
    OrderStatusAJAXResponse getStatus(@PathParam("id") String id);
}
