package app.fulfillment.domain;

import core.framework.api.validate.NotNull;
import core.framework.mongo.Collection;
import core.framework.mongo.Field;
import core.framework.mongo.Id;

import java.util.List;

@Collection(name = "fulfillments")
public class Fulfillment {
    @Id
    @NotNull
    @Field(name = "id")
    public String id;

    @NotNull
    @Field(name = "order_id")
    public String orderId;

    @NotNull
    @Field(name = "items")
    public List<String> items;

    @NotNull
    @Field(name = "status")
    public String status;
}
