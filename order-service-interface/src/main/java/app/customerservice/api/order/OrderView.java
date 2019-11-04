package app.customerservice.api.order;

import app.customerservice.api.fulfillment.FulfillmentView;
import core.framework.api.json.Property;

import java.util.List;

public class OrderView {
    @Property(name = "id")
    public String id;

    @Property(name = "fulfillments")
    public List<FulfillmentView> fulfillments;

    @Property(name = "address")
    public String address;

    @Property(name = "total_cost")
    public Double totalCost;
}
