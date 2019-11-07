package app.order.api;

import app.order.api.fulfillment.CreateFulfillmentBOAJAXRequest;
import app.order.api.fulfillment.CreateFulfillmentBOAJAXResponse;
import app.order.api.fulfillment.FulfillmentStatusBOAJAXResponse;
import app.order.api.fulfillment.SearchFulfillmentBOAJAXRequest;
import app.order.api.fulfillment.SearchFulfillmentBOAJAXResponse;
import app.order.api.fulfillment.UpdateFulfillmentBOAJAXRequest;
import app.order.api.fulfillment.UpdateFulfillmentBOAJAXResponse;
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
public interface FulfillmentBOAJAXWebService {
    @PUT
    @Path("/bo/ajax/fulfillment/:id/cancel")
    UpdateFulfillmentBOAJAXResponse cancel(@PathParam("id") String id, UpdateFulfillmentBOAJAXRequest request);

    @PUT
    @Path("/bo/ajax/fulfillment")
    SearchFulfillmentBOAJAXResponse search(SearchFulfillmentBOAJAXRequest request);

    @POST
    @Path("/bo/ajax/fulfillment")
    @ResponseStatus(HTTPStatus.CREATED)
    CreateFulfillmentBOAJAXResponse create(CreateFulfillmentBOAJAXRequest request);

    @GET
    @Path("/bo/ajax/fulfillment/:id")
    FulfillmentStatusBOAJAXResponse getStatus(@PathParam("id") String id);
}
