package app.customerservice.api;

import app.customerservice.api.order.*;
import core.framework.api.http.HTTPStatus;
import core.framework.api.web.service.*;

/**
 * @author: Cheffey
 */
public interface OrderWebService {
    @PUT
    @Path("/order/:id")
    UpdateOrderResponse update(@PathParam("id") String id, UpdateOrderRequest request);

    @PUT
    @Path("/order")
    SearchOrderResponse search(SearchOrderRequest request);

    @POST
    @Path("/order")
    @ResponseStatus(HTTPStatus.CREATED)
    CreateOrderResponse create(CreateOrderRequest request);

    @GET
    @Path("/order/:id")
    ReadOrderResponse get(@PathParam("id")String id);

    @DELETE
    @Path("/order/:id")
    void delete(@PathParam("id") String id);
}
