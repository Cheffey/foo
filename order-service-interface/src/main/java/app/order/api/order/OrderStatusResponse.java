package app.order.api.order;

import core.framework.api.json.Property;

import java.util.List;

/**
 * @author Cheffey
 */
public class OrderStatusResponse {
    @Property(name = "statuses")
    public List<String> statuses;
}
