package app.customerservice.api.order;

import core.framework.api.json.Property;
import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;

import java.util.ArrayList;
import java.util.UUID;

/**
 * @author: Cheffey
 */
public class CreateOrderResponse {
    @Property(name = "id")
    public String id;

    @Property(name="fulfillment_ids")
    public String fulfillmentIds;

    @Property(name = "address")
    public String address;

    @Property(name = "total-cost")
    public Double totalCost;
}
