package app.order.api.order;

import core.framework.api.json.Property;

import java.util.List;

/**
 * @author: Cheffey
 */
public class SearchOrderAJAXRequest {
    @Property(name = "id")
    public String id;

    @Property(name = "items")
    public List<String> items;

    @Property(name = "address")
    public String address;

    @Property(name = "tip")
    public Double tip;
}
