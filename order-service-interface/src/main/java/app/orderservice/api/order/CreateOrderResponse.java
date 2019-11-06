package app.orderservice.api.order;

import app.orderservice.api.fulfillment.FulfillmentView;
import core.framework.api.json.Property;

import java.util.List;

/**
 * @author: Cheffey
 */
public class CreateOrderResponse {
    @Property(name = "id")
    public String id;

    @Property(name = "address")
    public String address;

    @Property(name = "total_cost")
    public Double totalCost;

    @Property(name="fulfillments")
    public List<FulfillmentView> fulfillments;
}
