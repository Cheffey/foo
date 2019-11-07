package app;

import app.order.api.OrderBOAJAXWebService;
import app.order.api.OrderBOWebService;
import core.framework.inject.Inject;
import core.framework.web.Request;
import core.framework.web.Response;

/**
 * @author Cheffey
 */
public class HomeController {
    @Inject
    OrderBOWebService orderBOWebService;
    @Inject
    OrderBOAJAXWebService orderBOAJAXWebService;

    public Response cancel(String id, Request request) {
        return null;
    }


    public Response search(Request request) {
        //orderBOAJAXWebService.search();
        return Response.text("");
    }


    public Response create(Request request) {
        return null;
    }


    public Response get(Request request) {
        return null;
    }
}
