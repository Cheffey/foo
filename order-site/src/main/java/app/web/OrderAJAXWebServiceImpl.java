package app.web;

import app.order.api.OrderAJAXWebService;
import app.order.api.OrderWebService;
import app.order.api.order.CancelOrderResponse;
import app.order.api.order.CreateOrderRequest;
import app.order.api.order.CreateOrderResponse;
import app.order.api.order.GetOrderResponse;
import app.order.api.order.SearchOrderRequest;
import app.order.api.order.SearchOrderResponse;
import core.framework.inject.Inject;

/**
 * @author Cheffey
 */
public class OrderAJAXWebServiceImpl implements OrderAJAXWebService {
    @Inject
    OrderWebService orderWebService;

    @Override
    public CancelOrderResponse cancel(String id) {
        return orderWebService.cancel(id);
    }

    @Override
    public SearchOrderResponse search(SearchOrderRequest request) {
        return orderWebService.search(request);
    }

    @Override
    public CreateOrderResponse create(CreateOrderRequest request) {
        return orderWebService.create(request);
    }

    @Override
    public GetOrderResponse get(String id) {
        return orderWebService.get(id);
    }
}
