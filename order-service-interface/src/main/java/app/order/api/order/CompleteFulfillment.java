package app.order.api.order;

import core.framework.api.json.Property;

import java.util.List;

/**
 * @author Cheffey
 */
public class CompleteFulfillment {
    @Property(name = "id")
    public String id;

    @Property(name = "status")
    public String status;

    @Property(name = "items")
    public List<String> items;
}
