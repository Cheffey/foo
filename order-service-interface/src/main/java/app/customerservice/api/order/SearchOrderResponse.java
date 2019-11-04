package app.customerservice.api.order;

import app.customerservice.api.fulfillment.FulfillmentView;
import core.framework.api.json.Property;

import java.util.List;

/**
 * @author: Cheffey
 */
public class SearchOrderResponse {
    @Property(name = "total")
    public Integer total;

    @Property(name="orderviews")
    public List<OrderView> orderViews;
}
