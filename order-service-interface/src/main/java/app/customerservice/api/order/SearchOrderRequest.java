package app.customerservice.api.order;

import core.framework.api.json.Property;
import core.framework.api.validate.Min;
import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;

import java.util.List;

/**
 * @author: Cheffey
 */
public class SearchOrderRequest {
    @Property(name = "id")
    public String id;

    @Property(name="items")
    public List<String> items;

    @Property(name="address")
    public String address;

    @Property(name="tip")
    public Double tip;
}
