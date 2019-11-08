package app.order.web;

import app.order.api.OrderWebService;
import app.order.api.order.CancelOrderAJAXResponse;
import app.order.api.order.CancelOrderResponse;
import app.order.api.order.CreateOrderAJAXRequest;
import app.order.api.order.CreateOrderAJAXResponse;
import app.order.api.order.CreateOrderRequest;
import app.order.api.order.CreateOrderResponse;
import app.order.api.order.GetOrderAJAXResponse;
import app.order.api.order.GetOrderResponse;
import app.order.api.order.OrderAJAXWebService;
import app.order.api.order.SearchOrderAJAXRequest;
import app.order.api.order.SearchOrderAJAXResponse;
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
    public CancelOrderAJAXResponse cancel(String id) {
        return buildCancelOrderAJAXResponse(orderWebService.cancel(id));
    }

    @Override
    public SearchOrderAJAXResponse search(SearchOrderAJAXRequest request) {
        return buildSearchOrderAJAXResponse(orderWebService.search(searchOrderRequest(request)));
    }

    @Override
    public CreateOrderAJAXResponse create(CreateOrderAJAXRequest request) {
        return buildCreateOrderAJAXResponse(orderWebService.create(createOrderRequest(request)));
    }

    @Override
    public GetOrderAJAXResponse get(String id) {
        return buildGetOrderAJAXResponse(orderWebService.get(id));
    }

    private GetOrderAJAXResponse buildGetOrderAJAXResponse(GetOrderResponse getOrderResponse) {
        return null;
    }

    private CancelOrderAJAXResponse buildCancelOrderAJAXResponse(CancelOrderResponse cancelOrderResponse) {
        return null;
    }

    private CreateOrderAJAXResponse buildCreateOrderAJAXResponse(CreateOrderResponse CreateOrderResponse) {
        return null;
    }

    private SearchOrderAJAXResponse buildSearchOrderAJAXResponse(SearchOrderResponse SearchOrderResponse) {
        return null;
    }

    private SearchOrderRequest searchOrderRequest(SearchOrderAJAXRequest searchOrderAJAXRequest) {
        return null;
    }

    private CreateOrderRequest createOrderRequest(CreateOrderAJAXRequest CreateOrderAJAXRequest) {
        return null;
    }
}
