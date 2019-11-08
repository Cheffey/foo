package app.order.web;

import app.order.api.BOFulfillmentAJAXWebService;
import app.order.api.BOFulfillmentWebService;
import app.order.api.fulfillment.BOCreateFulfillmentAJAXRequest;
import app.order.api.fulfillment.BOCreateFulfillmentAJAXResponse;
import app.order.api.fulfillment.BOCreateFulfillmentRequest;
import app.order.api.fulfillment.BOCreateFulfillmentResponse;
import app.order.api.fulfillment.BOGetFulfillmentAJAXResponse;
import app.order.api.fulfillment.BOGetFulfillmentResponse;
import app.order.api.fulfillment.BOSearchFulfillmentAJAXRequest;
import app.order.api.fulfillment.BOSearchFulfillmentAJAXResponse;
import app.order.api.fulfillment.BOSearchFulfillmentRequest;
import app.order.api.fulfillment.BOSearchFulfillmentResponse;
import app.order.api.fulfillment.BOUpdateFulfillmentAJAXRequest;
import app.order.api.fulfillment.BOUpdateFulfillmentAJAXResponse;
import app.order.api.fulfillment.BOUpdateFulfillmentRequest;
import app.order.api.fulfillment.BOUpdateFulfillmentResponse;
import core.framework.inject.Inject;

/**
 * @author Cheffey
 */
public class BOFulfillmentAJAXWebServiceImpl implements BOFulfillmentAJAXWebService {
    @Inject
    BOFulfillmentWebService boFulfillmentWebService;

    @Override
    public BOGetFulfillmentAJAXResponse get(String id) {
        return buildGetFulfillmentAJAXResponse(boFulfillmentWebService.get(id));
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public BOSearchFulfillmentAJAXResponse search(BOSearchFulfillmentAJAXRequest request) {
        return buildSearchFulfillmentAJAXResponse(boFulfillmentWebService.search(searchFulfillmentRequest(request)));
    }

    @Override
    public BOCreateFulfillmentAJAXResponse create(BOCreateFulfillmentAJAXRequest request) {
        return buildCreateFulfillmentAJAXResponse(boFulfillmentWebService.create(createFulfillmentRequest(request)));
    }

    @Override
    public BOUpdateFulfillmentAJAXResponse update(String id, BOUpdateFulfillmentAJAXRequest request) {
        return buildUpdateFulfillmentAJAXResponse(boFulfillmentWebService.update(id, updateFulfillmentRequest(request)));
    }


    private BOGetFulfillmentAJAXResponse buildGetFulfillmentAJAXResponse(BOGetFulfillmentResponse boGetFulfillmentResponse) {
        boGetFulfillmentResponse.id = "";
        return null;
    }

    private BOCreateFulfillmentAJAXResponse buildCreateFulfillmentAJAXResponse(BOCreateFulfillmentResponse boCreateFulfillmentResponse) {
        boCreateFulfillmentResponse.id = "";
        return null;
    }

    private BOCreateFulfillmentRequest createFulfillmentRequest(BOCreateFulfillmentAJAXRequest boCreateFulfillmentAJAXRequest) {
        boCreateFulfillmentAJAXRequest.orderId = "";
        return null;
    }

    private BOUpdateFulfillmentAJAXResponse buildUpdateFulfillmentAJAXResponse(BOUpdateFulfillmentResponse boUpdateFulfillmentResponse) {
        boUpdateFulfillmentResponse.id = "";
        return null;
    }

    private BOUpdateFulfillmentRequest updateFulfillmentRequest(BOUpdateFulfillmentAJAXRequest boUpdateFulfillmentAJAXRequest) {
        boUpdateFulfillmentAJAXRequest.orderId = "";
        return null;
    }

    private BOSearchFulfillmentAJAXResponse buildSearchFulfillmentAJAXResponse(BOSearchFulfillmentResponse boSearchFulfillmentResponse) {
        boSearchFulfillmentResponse.total = 0;
        return null;
    }

    private BOSearchFulfillmentRequest searchFulfillmentRequest(BOSearchFulfillmentAJAXRequest boSearchFulfillmentAJAXRequest) {
        boSearchFulfillmentAJAXRequest.id = "";
        return null;
    }

}