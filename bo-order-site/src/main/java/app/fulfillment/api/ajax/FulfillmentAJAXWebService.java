package app.fulfillment.api.ajax;

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
public interface FulfillmentAJAXWebService {
    @PUT
    @Path("/fulfillment/:id/cancel")
    UpdateFulfillmentAJAXResponse cancel(@PathParam("id") String id, UpdateFulfillmentAJAXRequest request);

    @PUT
    @Path("/fulfillment/")
    SearchFulfillmentAJAXResponse search(SearchFulfillmentAJAXRequest request);

    @POST
    @Path("/fulfillment")
    @ResponseStatus(HTTPStatus.CREATED)
    CreateFulfillmentAJAXResponse create(CreateFulfillmentAJAXRequest request);

    @GET
    @Path("/fulfillment/:id")
    FulfillmentStatusAJAXResponse getStatus(@PathParam("id") String id);
}
