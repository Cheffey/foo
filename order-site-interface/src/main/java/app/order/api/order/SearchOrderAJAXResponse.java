package app.order.api.order;

import core.framework.api.json.Property;

import java.util.List;

/**
 * @author: Cheffey
 */
public class SearchOrderAJAXResponse {
    @Property(name = "total")
    public Integer total;

    @Property(name = "orderviews")
    public List<Order> orderViews;

    public static class Order {
        @Property(name = "id")
        public String id;

        @Property(name = "fulfillments")
        public List<CompleteFulfillment> fulfillments;

        @Property(name = "address")
        public String address;

        @Property(name = "total_cost")
        public Double totalCost;
    }
}
