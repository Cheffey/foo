package app.order.api.fulfillment;

import core.framework.api.json.Property;

/**
 * @author Cheffey
 */
public class FulfillmentStatusResponse {
    @Property(name = "status")
    public String status;
}
