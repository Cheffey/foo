package app.order.api;

import app.order.api.fulfillment.BOCreateFulfillmentAJAXRequest;
import app.order.api.fulfillment.BOCreateFulfillmentAJAXResponse;
import app.order.api.fulfillment.BOFulfillmentStatusAJAXResponse;
import app.order.api.fulfillment.BOSearchFulfillmentAJAXRequest;
import app.order.api.fulfillment.BOSearchFulfillmentAJAXResponse;
import app.order.api.fulfillment.BOUpdateFulfillmentAJAXRequest;
import app.order.api.fulfillment.BOUpdateFulfillmentAJAXResponse;
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
public interface BOFulfillmentAJAXWebService {
    @PUT
    @Path("/bo/ajax/fulfillment/:id/cancel")
    BOUpdateFulfillmentAJAXResponse cancel(@PathParam("id") String id, BOUpdateFulfillmentAJAXRequest request);

    @PUT
    @Path("/bo/ajax/fulfillment")
    BOSearchFulfillmentAJAXResponse search(BOSearchFulfillmentAJAXRequest request);

    @POST
    @Path("/bo/ajax/fulfillment")
    @ResponseStatus(HTTPStatus.CREATED)
    BOCreateFulfillmentAJAXResponse create(BOCreateFulfillmentAJAXRequest request);

    @GET
    @Path("/bo/ajax/fulfillment/:id")
    BOFulfillmentStatusAJAXResponse getStatus(@PathParam("id") String id);
}
