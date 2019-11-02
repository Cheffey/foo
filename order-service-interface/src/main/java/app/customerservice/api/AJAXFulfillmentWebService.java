package app.customerservice.api;

import app.customerservice.api.fulfillment.*;
import core.framework.api.http.HTTPStatus;
import core.framework.api.web.service.*;

/**
 * @author: Cheffey
 */
public interface AJAXFulfillmentWebService {
    @PUT
    @Path("/fulfillment/:id")
    UpdateFulfillmentResponse update(@PathParam("id") String id, UpdateFulfillmentRequest request);

    @POST
    @Path("/fulfillment")
    @ResponseStatus(HTTPStatus.CREATED)
    CreateFulfillmentResponse create(CreateFulfillmentRequest request);

    @GET
    @Path("/fulfillment/:id")
    ReadFulfillmentResponse read(@PathParam("id") String id);

    @DELETE
    @Path("/fulfillment/:id")
    void delete(@PathParam("id") String id);
}
