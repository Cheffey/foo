package app.order.web;

import app.order.service.OrderService;
import core.framework.inject.Inject;
import core.framework.web.Request;
import core.framework.web.Response;

/**
 * @author Cheffey
 */
public class HomeController {
    @Inject
    OrderService orderService;

    public Response cancel(String id, Request request) {
        return null;
    }


    public Response search(Request request) {
        return orderService.search(request);
    }


    public Response create(Request request) {
        return null;
    }


    public Response get(Request request) {
        return null;
    }
}
