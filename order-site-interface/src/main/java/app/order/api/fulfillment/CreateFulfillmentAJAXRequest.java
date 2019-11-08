package app.order.api.fulfillment;

import core.framework.api.json.Property;
import core.framework.api.validate.NotNull;

import java.util.List;

/**
 * @author: Cheffey
 */
public class CreateFulfillmentAJAXRequest {
    @Property(name = "order_id")
    public String orderId;

    @NotNull
    @Property(name = "items")
    public List<String> items;
}
