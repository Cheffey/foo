package app.order.web;

import app.order.api.FulfillmentWebService;
import app.order.api.fulfillment.CancelFulfillmentAJAXResponse;
import app.order.api.fulfillment.CancelFulfillmentResponse;
import app.order.api.fulfillment.CreateFulfillmentAJAXRequest;
import app.order.api.fulfillment.CreateFulfillmentAJAXResponse;
import app.order.api.fulfillment.CreateFulfillmentRequest;
import app.order.api.fulfillment.CreateFulfillmentResponse;
import app.order.api.fulfillment.FulfillmentAJAXWebService;
import app.order.api.fulfillment.FulfillmentStatusAJAXResponse;
import app.order.api.fulfillment.FulfillmentStatusResponse;
import app.order.api.fulfillment.GetFulfillmentAJAXResponse;
import app.order.api.fulfillment.GetFulfillmentResponse;
import app.order.api.fulfillment.SearchFulfillmentAJAXRequest;
import app.order.api.fulfillment.SearchFulfillmentAJAXResponse;
import app.order.api.fulfillment.SearchFulfillmentRequest;
import app.order.api.fulfillment.SearchFulfillmentResponse;
import core.framework.inject.Inject;

/**
 * @author Cheffey
 */
public class FulfillmentAJAXWebServiceImpl implements FulfillmentAJAXWebService {
    @Inject
    FulfillmentWebService fulfillmentWebService;

    @Override
    public GetFulfillmentAJAXResponse get(String id) {
        return buildGetFulfillmentAJAXResponse(fulfillmentWebService.get(id));
    }

    @Override
    public CancelFulfillmentAJAXResponse cancel(String id) {
        return buildCancelFulfillmentAJAXResponse(fulfillmentWebService.cancel(id));
    }

    @Override
    public SearchFulfillmentAJAXResponse search(SearchFulfillmentAJAXRequest request) {
        return buildSearchFulfillmentAJAXResponse(fulfillmentWebService.search(searchFulfillmentRequest(request)));
    }

    @Override
    public CreateFulfillmentAJAXResponse create(CreateFulfillmentAJAXRequest request) {
        return buildCreateFulfillmentAJAXResponse(fulfillmentWebService.create(createFulfillmentRequest(request)));
    }

    @Override
    public FulfillmentStatusAJAXResponse getStatus(String id) {
        return buildFulfillmentStatusAJAXResponse(fulfillmentWebService.getStatus(id));
    }





    private GetFulfillmentAJAXResponse buildGetFulfillmentAJAXResponse(GetFulfillmentResponse getFulfillmentResponse) {
        return null;
    }

    private CancelFulfillmentAJAXResponse buildCancelFulfillmentAJAXResponse(CancelFulfillmentResponse cancelFulfillmentResponse) {
        return null;
    }

    private FulfillmentStatusAJAXResponse buildFulfillmentStatusAJAXResponse(FulfillmentStatusResponse fulfillmentStatusResponse) {
        return null;
    }

    private CreateFulfillmentAJAXResponse buildCreateFulfillmentAJAXResponse(CreateFulfillmentResponse CreateFulfillmentResponse) {
        return null;
    }

    private SearchFulfillmentAJAXResponse buildSearchFulfillmentAJAXResponse(SearchFulfillmentResponse SearchFulfillmentResponse) {
        return null;
    }

    private SearchFulfillmentRequest searchFulfillmentRequest(SearchFulfillmentAJAXRequest searchFulfillmentAJAXRequest){
        return null;
    }

    private CreateFulfillmentRequest createFulfillmentRequest(CreateFulfillmentAJAXRequest CreateFulfillmentAJAXRequest){
        return null;
    }
}