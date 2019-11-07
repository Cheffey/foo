package app.order.api.fulfillment;

import core.framework.api.json.Property;

import java.util.List;

/**
 * @author: Cheffey
 */
public class BOCreateFulfillmentResponse {
    @Property(name = "id")
    public String id;

    @Property(name="items")
    public List<String> items;

    @Property(name="status")
    public String status;
}
