package app.order.web;

import app.order.api.OrderWebService;
import app.order.api.order.GetOrderAJAXResponse;
import app.order.api.order.GetOrderResponse;
import core.framework.inject.Inject;
import core.framework.web.Request;
import core.framework.web.Response;

/**
 * @author Cheffey
 */
public class HomeController {
    @Inject
    OrderWebService OrderWebService;

    public Response cancel(String id, Request request) {
        return null;
    }


    public Response search(Request request) {
        return null;
    }


    public Response create(Request request) {
        return null;
    }


    public Response get(Request request) {
        String id = request.pathParam("id");
        GetOrderAJAXResponse getOrderAJAXResponse = buildGetOrderAJAXResponse(OrderWebService.get(id));
        return Response.bean(getOrderAJAXResponse);
    }

    private GetOrderAJAXResponse buildGetOrderAJAXResponse(GetOrderResponse getOrderResponse){
        return null;
    }
}
