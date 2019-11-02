package app.customerservice.api;

import app.customerservice.api.order.*;
import core.framework.api.http.HTTPStatus;
import core.framework.api.web.service.*;

/**
 * @author: Cheffey
 */
public interface AJAXOrderWebService {
    @PUT
    @Path("/order/:id")
    UpdateOrderResponse update(@PathParam("id") String id, UpdateOrderRequest request);

    @POST
    @Path("/order")
    @ResponseStatus(HTTPStatus.CREATED)
    CreateOrderResponse create(CreateOrderRequest request);

    @GET
    @Path("/order/:id")
    ReadOrderResponse read(@PathParam("id")String id);

    @DELETE
    @Path("/order/:id")
    void delete(@PathParam("id") String id);
}
