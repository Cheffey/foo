package app.customerservice.api;

import app.customerservice.api.fulfillment.CreateFulfillmentRequest;
import app.customerservice.api.fulfillment.CreateFulfillmentResponse;
import app.customerservice.api.fulfillment.ReadFulfillmentResponse;
import app.customerservice.api.fulfillment.SearchFulfillmentRequest;
import app.customerservice.api.fulfillment.SearchFulfillmentResponse;
import app.customerservice.api.fulfillment.UpdateFulfillmentRequest;
import app.customerservice.api.fulfillment.UpdateFulfillmentResponse;
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
public interface FulfillmentBOWebService {
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
