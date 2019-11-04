package app.customerservice.api;

import app.customerservice.api.fulfillment.*;
import core.framework.api.http.HTTPStatus;
import core.framework.api.web.service.*;

/**
 * @author: Cheffey
 */
public interface FulfillmentWebService {
    @PUT
    @Path("/fulfillment/:id")
    UpdateFulfillmentResponse update(@PathParam("id") String id, UpdateFulfillmentRequest request);

    @PUT
    @Path("/fulfillment/")
    SearchFulfillmentResponse search(SearchFulfillmentRequest request);

    @POST
    @Path("/fulfillment")
    @ResponseStatus(HTTPStatus.CREATED)
    CreateFulfillmentResponse create(CreateFulfillmentRequest request);

    @GET
    @Path("/fulfillment/:id")
    ReadFulfillmentResponse get(@PathParam("id") String id);

    @DELETE
    @Path("/fulfillment/:id")
    void delete(@PathParam("id") String id);
}
