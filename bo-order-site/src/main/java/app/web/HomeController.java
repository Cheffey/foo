package app.web;

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
public class HomeController {
    @Inject
    BOOrderWebService boOrderWebService;
    @Inject
    BOOrderAJAXWebService boOrderAJAXWebService;

    public Response cancel(String id, Request request) {
        return null;
    }


    public Response search(Request request) {
        BOSearchOrderAJAXRequest boSearchOrderAJAXRequest = request.bean(BOSearchOrderAJAXRequest.class);
        BOSearchOrderAJAXResponse boSearchOrderAJAXResponse = boOrderAJAXWebService.search(boSearchOrderAJAXRequest);
        return Response.bean(boSearchOrderAJAXResponse);
    }


    public Response create(Request request) {
        return null;
    }


    public Response get(Request request) {
        return null;
    }
}
