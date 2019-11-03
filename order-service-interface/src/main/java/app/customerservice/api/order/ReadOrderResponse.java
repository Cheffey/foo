package app.customerservice.api.order;

import core.framework.api.json.Property;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Cheffey
 */
public class ReadOrderResponse {
    @Property(name = "id")
    public String id;

    @Property(name="fulfillment_ids")
    public String fulfillmentIds;

    @Property(name = "address")
    public String address;

    @Property(name = "total-cost")
    public Double totalCost;
}
