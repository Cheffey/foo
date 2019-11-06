package app.orderservice.api.order;

import core.framework.api.json.Property;
import core.framework.api.validate.Min;

import java.util.List;

/**
 * @author: Cheffey
 */
public class UpdateOrderRequest {
    @Property(name="items")
    public List<String> items;

    @Property(name="address")
    public String address;

    @Min(0)
    @Property(name="total")
    public Double total;
}
