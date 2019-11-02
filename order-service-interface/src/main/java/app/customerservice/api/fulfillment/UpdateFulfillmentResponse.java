package app.customerservice.api.fulfillment;

import core.framework.api.json.Property;

/**
 * @author: Cheffey
 */
public class UpdateFulfillmentResponse {
    @Property(name = "id")
    public java.lang.String id;

    @Property(name="items")
    public String items;

    @Property(name="status")
    public String status;
}
