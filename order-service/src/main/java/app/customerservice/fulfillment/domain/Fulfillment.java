package app.customerservice.fulfillment.domain;

import core.framework.api.validate.NotNull;
import core.framework.mongo.Collection;
import core.framework.mongo.Field;
import core.framework.mongo.Id;

@Collection(name="fulfillments")
public class Fulfillment {
    @Id
    @NotNull
    @Field(name="id")
    public java.lang.String id;

    @NotNull
    @Field(name="items")
    public String items;

    @NotNull
    @Field(name="status")
    public Status status;
}
