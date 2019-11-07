package app.order.api;

import app.order.api.fulfillment.BOCreateFulfillmentRequest;
import app.order.api.fulfillment.BOCreateFulfillmentResponse;
import app.order.api.fulfillment.GetFulfillmentResponse;
import app.order.api.fulfillment.BOSearchFulfillmentRequest;
import app.order.api.fulfillment.BOSearchFulfillmentResponse;
import app.order.api.fulfillment.BOUpdateFulfillmentRequest;
import app.order.api.fulfillment.BOUpdateFulfillmentResponse;
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
public interface BOFulfillmentWebService {
    @PUT
    @Path("/fulfillment/:id")
    BOUpdateFulfillmentResponse update(@PathParam("id") String id, BOUpdateFulfillmentRequest request);

    @PUT
    @Path("/fulfillment")
    BOSearchFulfillmentResponse search(BOSearchFulfillmentRequest request);

    @POST
    @Path("/fulfillment")
    @ResponseStatus(HTTPStatus.CREATED)
    BOCreateFulfillmentResponse create(BOCreateFulfillmentRequest request);

    @GET
    @Path("/fulfillment/:id")
    GetFulfillmentResponse get(@PathParam("id") String id);

    @DELETE
    @Path("/fulfillment/:id")
    void delete(@PathParam("id") String id);
}
