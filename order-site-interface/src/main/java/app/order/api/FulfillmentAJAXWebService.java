package app.order.api;

import app.order.api.fulfillment.CancelFulfillmentAJAXResponse;
import app.order.api.fulfillment.CreateFulfillmentAJAXRequest;
import app.order.api.fulfillment.CreateFulfillmentAJAXResponse;
import app.order.api.fulfillment.FulfillmentStatusAJAXResponse;
import app.order.api.fulfillment.GetFulfillmentAJAXResponse;
import app.order.api.fulfillment.SearchFulfillmentAJAXRequest;
import app.order.api.fulfillment.SearchFulfillmentAJAXResponse;
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
    @GET
    @Path("/ajax/fulfillment/:id")
    GetFulfillmentAJAXResponse get(@PathParam("id") String id);

    @PUT
    @Path("/ajax/fulfillment/:id/cancel")
    CancelFulfillmentAJAXResponse cancel(@PathParam("id") String id);

    @PUT
    @Path("/ajax/fulfillment")
    SearchFulfillmentAJAXResponse search(SearchFulfillmentAJAXRequest request);

    @POST
    @Path("/ajax/fulfillment")
    @ResponseStatus(HTTPStatus.CREATED)
    CreateFulfillmentAJAXResponse create(CreateFulfillmentAJAXRequest request);

    @GET
    @Path("/ajax/fulfillment/:id/status")
    FulfillmentStatusAJAXResponse getStatus(@PathParam("id") String id);


}
