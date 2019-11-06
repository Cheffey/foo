package app.orderservice.api;

import app.orderservice.api.order.CreateOrderRequest;
import app.orderservice.api.order.CreateOrderResponse;
import app.orderservice.api.order.ReadOrderResponse;
import app.orderservice.api.order.SearchOrderRequest;
import app.orderservice.api.order.SearchOrderResponse;
import app.orderservice.api.order.UpdateOrderRequest;
import app.orderservice.api.order.UpdateOrderResponse;
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
    SearchOrderResponse search(SearchOrderRequest request);

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
