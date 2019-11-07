package app.order.api;

import app.order.api.order.BOCreateOrderRequest;
import app.order.api.order.BOCreateOrderResponse;
import app.order.api.order.GetOrderResponse;
import app.order.api.order.BOSearchOrderRequest;
import app.order.api.order.BOSearchOrderResponse;
import app.order.api.order.BOUpdateOrderRequest;
import app.order.api.order.BOUpdateOrderResponse;
import core.framework.api.http.HTTPStatus;
import core.framework.api.web.service.DELETE;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.POST;
import core.framework.api.web.service.PUT;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;
import core.framework.api.web.service.ResponseStatus;

/**
 * @author: Cheffey
 */
public interface BOOrderWebService {
    @PUT
    @Path("/order/:id")
    BOUpdateOrderResponse update(@PathParam("id") String id, BOUpdateOrderRequest request);

    @PUT
    @Path("/order")
    BOSearchOrderResponse search(BOSearchOrderRequest request);

    @POST
    @Path("/order")
    @ResponseStatus(HTTPStatus.CREATED)
    BOCreateOrderResponse create(BOCreateOrderRequest request);

    @GET
    @Path("/order/:id")
    GetOrderResponse get(@PathParam("id") String id);

    @DELETE
    @Path("/order/:id")
    void delete(@PathParam("id") String id);
}
