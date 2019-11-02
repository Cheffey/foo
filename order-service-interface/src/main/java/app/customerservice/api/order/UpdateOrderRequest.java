package app.customerservice.api.order;

import core.framework.api.json.Property;
import core.framework.api.validate.Min;
import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;

/**
 * @author: Cheffey
 */
public class UpdateOrderRequest {
    @NotNull
    @NotBlank
    @Property(name="item")
    public String item;

    @NotNull
    @NotBlank
    @Property(name="address")
    public String address;

    @Min(0)
    @Property(name="tip")
    public Double tip;
}
