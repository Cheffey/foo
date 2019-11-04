package app.customerservice.api.fulfillment;

import core.framework.api.json.Property;
import core.framework.api.validate.NotNull;

/**
 * @author: Cheffey
 */
public class CreateFulfillmentRequest {
    @NotNull
    @Property(name = "items")
    public String items;

    @NotNull
    @Property(name = "status")
    public String status;
}
