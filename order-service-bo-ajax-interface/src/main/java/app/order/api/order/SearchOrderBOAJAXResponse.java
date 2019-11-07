package app.order.api.order;

import core.framework.api.json.Property;

import java.util.List;

/**
 * @author: Cheffey
 */
public class SearchOrderBOAJAXResponse {
    @Property(name = "total")
    public Integer total;

    @Property(name="orderviews")
    public List<OrderView> orderViews;
}
