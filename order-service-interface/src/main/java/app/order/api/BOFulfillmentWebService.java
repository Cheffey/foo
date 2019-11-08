package app.order.api;

import app.order.api.fulfillment.BOCreateFulfillmentRequest;
import app.order.api.fulfillment.BOCreateFulfillmentResponse;
import app.order.api.fulfillment.BOGetFulfillmentResponse;
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
    @Path("/bo/fulfillment/:id")
    BOUpdateFulfillmentResponse update(@PathParam("id") String id, BOUpdateFulfillmentRequest request);

    @PUT
    @Path("/bo/fulfillment")
    BOSearchFulfillmentResponse search(BOSearchFulfillmentRequest request);

    @POST
    @Path("/bo/fulfillment")
    @ResponseStatus(HTTPStatus.CREATED)
    BOCreateFulfillmentResponse create(BOCreateFulfillmentRequest request);

    @GET
    @Path("/bo/fulfillment/:id")
    BOGetFulfillmentResponse get(@PathParam("id") String id);

    @DELETE
    @Path("/bo/fulfillment/:id")
    void delete(@PathParam("id") String id);
}
