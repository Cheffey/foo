package app.order.api;

import app.order.api.order.CreateOrderRequest;
import app.order.api.order.CreateOrderResponse;
import app.order.api.order.ReadOrderResponse;
import app.order.api.order.SearchOrderRequest;
import app.order.api.order.SearchOrderBOAJAXResponse;
import app.order.api.order.UpdateOrderRequest;
import app.order.api.order.UpdateOrderResponse;
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
public interface OrderWebService {
    @PUT
    @Path("/order/:id")
    UpdateOrderResponse update(@PathParam("id") String id, UpdateOrderRequest request);

    @PUT
    @Path("/order")
    SearchOrderBOAJAXResponse search(SearchOrderRequest request);

    @POST
    @Path("/order")
    @ResponseStatus(HTTPStatus.CREATED)
    CreateOrderResponse create(CreateOrderRequest request);

    @GET
    @Path("/order/:id")
    ReadOrderResponse get(@PathParam("id") String id);

    @DELETE
    @Path("/order/:id")
    void delete(@PathParam("id") String id);
}
