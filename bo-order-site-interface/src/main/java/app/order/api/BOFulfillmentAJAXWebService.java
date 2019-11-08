package app.order.api;

import app.order.api.fulfillment.BOCreateFulfillmentAJAXRequest;
import app.order.api.fulfillment.BOCreateFulfillmentAJAXResponse;
import app.order.api.fulfillment.BOGetFulfillmentAJAXResponse;
import app.order.api.fulfillment.BOSearchFulfillmentAJAXRequest;
import app.order.api.fulfillment.BOSearchFulfillmentAJAXResponse;
import app.order.api.fulfillment.BOUpdateFulfillmentAJAXRequest;
import app.order.api.fulfillment.BOUpdateFulfillmentAJAXResponse;
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
public interface BOFulfillmentAJAXWebService {
    @PUT
    @Path("/ajax/fulfillment/:id")
    BOUpdateFulfillmentAJAXResponse update(@PathParam("id") String id, BOUpdateFulfillmentAJAXRequest request);

    @PUT
    @Path("/ajax/fulfillment")
    BOSearchFulfillmentAJAXResponse search(BOSearchFulfillmentAJAXRequest request);

    @POST
    @Path("/ajax/fulfillment")
    @ResponseStatus(HTTPStatus.CREATED)
    BOCreateFulfillmentAJAXResponse create(BOCreateFulfillmentAJAXRequest request);

    @GET
    @Path("/ajax/fulfillment/:id")
    BOGetFulfillmentAJAXResponse get(@PathParam("id") String id);

    @DELETE
    @Path("/ajax/fulfillment/:id")
    void delete(@PathParam("id") String id);
}
