package app.customerservice.api.order;

import core.framework.api.json.Property;

/**
 * @author: Cheffey
 */
public class UpdateOrderResponse {
    @Property(name = "id")
    public String id;

    @Property(name = "item")
    public String item;

    @Property(name = "address")
    public String address;

    @Property(name = "total-cost")
    public Double totalCost;
}
