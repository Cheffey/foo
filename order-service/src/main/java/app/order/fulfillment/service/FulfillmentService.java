package app.order.fulfillment.service;

import app.order.api.fulfillment.BOCreateFulfillmentRequest;
import app.order.api.fulfillment.BOCreateFulfillmentResponse;
import app.order.api.fulfillment.FulfillmentView;
import app.order.api.fulfillment.GetFulfillmentResponse;
import app.order.api.fulfillment.BOSearchFulfillmentRequest;
import app.order.api.fulfillment.BOSearchFulfillmentResponse;
import app.order.api.fulfillment.BOUpdateFulfillmentRequest;
import app.order.api.fulfillment.BOUpdateFulfillmentResponse;
import app.order.fulfillment.domain.Fulfillment;
import app.order.fulfillment.domain.Status;
import com.mongodb.client.model.Updates;
import core.framework.inject.Inject;
import core.framework.mongo.MongoCollection;
import core.framework.web.exception.NotFoundException;
import org.bson.conversions.Bson;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;

public class FulfillmentService {
    @Inject
    MongoCollection<Fulfillment> fulfillmentCollection;

    public BOUpdateFulfillmentResponse update(String id, BOUpdateFulfillmentRequest request) {
        fulfillmentCollection.get(id).orElseThrow(() -> new NotFoundException("can't get fulfillment with id: " + id));
        List<Bson> updates = new ArrayList<>();
        if (request.orderId != null) {
            updates.add(Updates.set("order_id", request.orderId));
        }
        if (request.items != null) {
            updates.add(Updates.set("items", request.items));
        }
        if (request.status != null) {
            updates.add(Updates.set("status", request.status));
        }
        if (!updates.isEmpty()) {
            fulfillmentCollection.update(eq("_id", id), Updates.combine(updates));
        }
        BOUpdateFulfillmentResponse boUpdateFulfillmentResponse = new BOUpdateFulfillmentResponse();
        boUpdateFulfillmentResponse.items = request.items;
        boUpdateFulfillmentResponse.status = request.status;
        return boUpdateFulfillmentResponse;
    }

    public BOCreateFulfillmentResponse create(BOCreateFulfillmentRequest request) {
        Fulfillment fulfillment = new Fulfillment();
        fulfillment.orderId = request.orderId;
        fulfillment.id = UUID.randomUUID().toString();
        fulfillment.items = request.items;
        fulfillment.status = Status.valueOf("PENDING");
        fulfillmentCollection.insert(fulfillment);
        BOCreateFulfillmentResponse boCreateFulfillmentResponse = new BOCreateFulfillmentResponse();
        //orderId won't show in response
        boCreateFulfillmentResponse.id = fulfillment.id;
        boCreateFulfillmentResponse.items = request.items;
        boCreateFulfillmentResponse.status = "PENDING";
        return boCreateFulfillmentResponse;
    }

    public GetFulfillmentResponse get(String id) {
        Fulfillment fulfillment = fulfillmentCollection.get(id).orElseThrow(() -> new NotFoundException("can't get fulfillment with id: " + id));
        GetFulfillmentResponse getFulfillmentResponse = new GetFulfillmentResponse();
        //orderId won't show in response
        getFulfillmentResponse.id = fulfillment.id;
        getFulfillmentResponse.items = fulfillment.items;
        getFulfillmentResponse.status = fulfillment.status.toString();
        return getFulfillmentResponse;
    }

    public void delete(String id) {
        fulfillmentCollection.delete(id);
    }

    public BOSearchFulfillmentResponse search(BOSearchFulfillmentRequest request) {
        BOSearchFulfillmentResponse boSearchFulfillmentResponse = new BOSearchFulfillmentResponse();
        List<Bson> filters = new ArrayList<>();
        //filters.add(eq("_id", request.id));
        if (request.orderId != null) {
            filters.add(eq("order_id", request.orderId));
        }
        if (request.items != null) {
            filters.add(eq("items", request.items));
        }
        if (request.status != null) {
            filters.add(eq("status", request.status));
        }
        boSearchFulfillmentResponse.fulfillments = fulfillmentCollection.find(and(filters))
                .stream().map(fulfillment -> {
                    FulfillmentView fulfillmentView = new FulfillmentView();
                    fulfillmentView.id = fulfillment.id;
                    fulfillmentView.status = fulfillment.status.toString();
                    fulfillmentView.items = fulfillment.items;
                    return fulfillmentView;
                }).collect(Collectors.toList());
        boSearchFulfillmentResponse.total = boSearchFulfillmentResponse.fulfillments.size();
        return boSearchFulfillmentResponse;
    }

    public BOUpdateFulfillmentResponse cancel(BOUpdateFulfillmentRequest request) {
        return new BOUpdateFulfillmentResponse();
    }
}