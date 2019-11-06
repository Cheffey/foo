package app.customerservice.api;

import app.customerservice.api.order.CreateOrderRequest;
import app.customerservice.api.order.CreateOrderResponse;
import app.customerservice.api.order.OrderStatusResponse;
import app.customerservice.api.order.SearchOrderRequest;
import app.customerservice.api.order.SearchOrderResponse;
import app.customerservice.api.order.UpdateOrderRequest;
import app.customerservice.api.order.UpdateOrderResponse;
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
    UpdateOrderResponse cancel(@PathParam("id") String id, UpdateOrderRequest request);

    @PUT
    @Path("/ajax/order")
    SearchOrderResponse search(SearchOrderRequest request);

    @POST
    @Path("/ajax/order")
    @ResponseStatus(HTTPStatus.CREATED)
    CreateOrderResponse create(CreateOrderRequest request);

    @GET
    @Path("/ajax/order/:id")
    OrderStatusResponse getStatus(@PathParam("id") String id);
}
