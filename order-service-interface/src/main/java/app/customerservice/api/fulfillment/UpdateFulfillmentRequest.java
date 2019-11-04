package app.customerservice.api.fulfillment;

import core.framework.api.json.Property;
import core.framework.api.validate.NotNull;

import java.util.List;

/**
 * @author: Cheffey
 */
public class UpdateFulfillmentRequest {
    @Property(name = "order_id")
    public String orderId;

    @Property(name="items")
    public List<String> items;

    @Property(name="status")
    public String status;
}
