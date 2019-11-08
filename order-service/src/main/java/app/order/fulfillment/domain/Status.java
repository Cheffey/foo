package app.order.fulfillment.domain;

import core.framework.mongo.MongoEnumValue;

public enum Status {
    @MongoEnumValue("PENDING")
    PENDING,
    @MongoEnumValue("IN_TRANSIT")
    IN_TRANSIT,
    @MongoEnumValue("IN_COOKING")
    IN_COOKING,
    @MongoEnumValue("FOOD_READY")
    FOOD_READY,
    @MongoEnumValue("DELIVERED")
    DELIVERED,
    @MongoEnumValue("CANCELLED")
    CANCELLED
}
