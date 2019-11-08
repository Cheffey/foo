package app.order.api.order;

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
    CancelOrderAJAXResponse cancel(@PathParam("id") String id);

    @PUT
    @Path("/ajax/order")
    SearchOrderAJAXResponse search(SearchOrderAJAXRequest request);

    @POST
    @Path("/ajax/order")
    @ResponseStatus(HTTPStatus.CREATED)
    CreateOrderAJAXResponse create(CreateOrderAJAXRequest request);

    @GET
    @Path("/ajax/order/:id")
    GetOrderAJAXResponse get(@PathParam("id") String id);
}
