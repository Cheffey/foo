package app.customerservice.order.domain;

import core.framework.db.Column;
import core.framework.db.PrimaryKey;
import core.framework.db.Table;

@Table(name="orders")
public class Order {
    @PrimaryKey
    @Column(name="id")
    public String id;

    @Column(name="fulfillment_ids")
    public String fulfillmentIds;

    @Column(name="address")
    public String address;

    @Column(name="total_cost")
    public Double totalCost;

}