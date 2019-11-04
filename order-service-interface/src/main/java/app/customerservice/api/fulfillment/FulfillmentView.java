package app.customerservice.api.fulfillment;

import core.framework.api.json.Property;

import java.util.List;

public class FulfillmentView {
    @Property(name = "id")
    public String id;
//
//    public String OrderId;

    @Property(name = "items")
    public List<String> items;

    @Property(name = "status")
    public String status;
}
