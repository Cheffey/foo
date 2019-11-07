package app.order.api.order;

import core.framework.api.json.Property;
import core.framework.api.validate.Min;
import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;

import java.util.List;

/**
 * @author: Cheffey
 */
public class CreateOrderBOAJAXRequest {
    @NotNull
    @Property(name="items")
    public List<String> items;

    @NotNull
    @NotBlank
    @Property(name="address")
    public String address;

    @Min(0)
    @Property(name="tip")
    public Double tip;
}
