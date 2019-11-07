package app.service;

import app.order.api.BOOrderAJAXWebService;
import app.order.api.BOOrderWebService;
import app.order.api.order.BOSearchOrderAJAXRequest;
import app.order.api.order.BOSearchOrderAJAXResponse;
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
        BOSearchOrderAJAXRequest boSearchOrderAJAXRequest = request.bean(BOSearchOrderAJAXRequest.class);
        BOSearchOrderAJAXResponse boSearchOrderAJAXResponse = boOrderAJAXWebService.search(boSearchOrderAJAXRequest);
        return Response.bean(boSearchOrderAJAXResponse);
    }
}
