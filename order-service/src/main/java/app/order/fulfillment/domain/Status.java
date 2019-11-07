package app.order.fulfillment.domain;

import core.framework.mongo.MongoEnumValue;

public enum Status {
    @MongoEnumValue("pending")
    PENDING,
    @MongoEnumValue("in_transit")
    IN_TRANSIT,
    @MongoEnumValue("in_cooking")
    IN_COOKING,
    @MongoEnumValue("food_ready")
    FOOD_READY,
    @MongoEnumValue("delivered")
    DELIVERED,
    @MongoEnumValue("cancelled")
    CANCELLED
}
