package app.order.api.fulfillment;

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
public interface FulfillmentAJAXWebService{
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
