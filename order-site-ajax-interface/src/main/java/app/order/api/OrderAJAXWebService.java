package app.order.api;

import app.order.api.order.CancelOrderResponse;
import app.order.api.order.CreateOrderRequest;
import app.order.api.order.CreateOrderResponse;
import app.order.api.order.GetOrderResponse;
import app.order.api.order.SearchOrderRequest;
import app.order.api.order.SearchOrderResponse;
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
    @Path("/ajax/order/:id")
    CancelOrderResponse cancel(@PathParam("id") String id);

    @PUT
    @Path("/ajax/order")
    SearchOrderResponse search(SearchOrderRequest request);

    @POST
    @Path("/ajax/order")
    @ResponseStatus(HTTPStatus.CREATED)
    CreateOrderResponse create(CreateOrderRequest request);

    @GET
    @Path("/ajax/order/:id")
    GetOrderResponse get(@PathParam("id") String id);
}
