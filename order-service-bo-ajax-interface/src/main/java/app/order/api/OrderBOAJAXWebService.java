package app.order.api;

import app.order.api.order.CreateOrderBOAJAXRequest;
import app.order.api.order.CreateOrderBOAJAXResponse;
import app.order.api.order.OrderStatusBOAJAXResponse;
import app.order.api.order.SearchOrderBOAJAXRequest;
import app.order.api.order.SearchOrderBOAJAXResponse;
import app.order.api.order.UpdateOrderBOAJAXRequest;
import app.order.api.order.UpdateOrderBOAJAXResponse;
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
public interface OrderBOAJAXWebService {
    @PUT
    @Path("/bo/ajax/order/:id/cancel")
    UpdateOrderBOAJAXResponse cancel(@PathParam("id") String id, UpdateOrderBOAJAXRequest request);

    @PUT
    @Path("/bo/ajax/order")
    SearchOrderBOAJAXResponse search(SearchOrderBOAJAXRequest request);

    @POST
    @Path("/bo/ajax/order")
    @ResponseStatus(HTTPStatus.CREATED)
    CreateOrderBOAJAXResponse create(CreateOrderBOAJAXRequest request);

    @GET
    @Path("/bo/ajax/order/:id")
    OrderStatusBOAJAXResponse getStatus(@PathParam("id") String id);
}
