package app.customerservice.api.order;

import core.framework.api.json.Property;
import core.framework.api.validate.Min;
import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;

import java.util.ArrayList;

/**
 * @author: Cheffey
 */
public class UpdateOrderRequest {
    @NotNull
    @NotBlank
    @Property(name="fulfillment_ids")
    public String fulfillmentIds;

    @NotNull
    @NotBlank
    @Property(name="address")
    public String address;

    @Min(0)
    @Property(name="tip")
    public Double tip;
}
