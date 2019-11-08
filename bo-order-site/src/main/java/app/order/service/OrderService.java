package app.order.service;

import app.order.api.BOOrderAJAXWebService;
import app.order.api.BOOrderWebService;
import app.order.api.order.BOSearchOrderRequest;
import app.order.api.order.BOSearchOrderResponse;
import core.framework.inject.Inject;
import core.framework.web.Request;
import core.framework.web.Response;

/**
 * @author Cheffey
 */
public class OrderService {
    @Inject
    BOOrderWebService boOrderWebService;
    @Inject
    BOOrderAJAXWebService boOrderAJAXWebService;

    public Response search(Request request) {
        BOSearchOrderRequest boSearchOrderRequest = request.bean(BOSearchOrderRequest.class);
        BOSearchOrderResponse boSearchOrderResponse = boOrderAJAXWebService.search(boSearchOrderRequest);
        return Response.bean(boSearchOrderResponse);
    }
}
