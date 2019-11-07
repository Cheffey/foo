package app.order.api.fulfillment;

import core.framework.api.json.Property;

import java.util.List;

/**
 * @author: Cheffey
 */
public class BOSearchFulfillmentAJAXResponse {
    @Property(name = "total")
    public Integer total;

    @Property(name = "fulfillments")
    public List<Fulfillment> fulfillments;

    public static class Fulfillment {
        @Property(name = "id")
        public String id;

        @Property(name = "status")
        public String status;
    }
}
