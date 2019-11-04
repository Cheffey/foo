package app.customerservice.fulfillment.service;

import app.customerservice.api.fulfillment.CreateFulfillmentRequest;
import app.customerservice.api.fulfillment.UpdateFulfillmentRequest;
import app.customerservice.api.fulfillment.*;
import app.customerservice.api.fulfillment.FulfillmentView;
import app.customerservice.fulfillment.domain.Fulfillment;
import app.customerservice.fulfillment.domain.Status;
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

    public UpdateFulfillmentResponse update(String id, UpdateFulfillmentRequest request) {
        Fulfillment fulfillment = fulfillmentCollection.get(id).orElseThrow(() -> new NotFoundException("can't get fulfillment with id: " + id));
        List<Bson> updates = new ArrayList<Bson>();
        if (request.orderId != null) {
            updates.add(Updates.set("order_id", request.orderId));
        }
        if (request.items != null) {
            updates.add(Updates.set("items", request.items));
        }
        if (request.status != null) {
            updates.add(Updates.set("status", request.status));
        }
        if (updates.size() > 0) {
            fulfillmentCollection.update(eq("_id", id), Updates.combine(updates));
        }
        UpdateFulfillmentResponse updateFulfillmentResponse = new UpdateFulfillmentResponse();
        updateFulfillmentResponse.items = request.items;
        updateFulfillmentResponse.status = request.status;
        return updateFulfillmentResponse;
    }

    public CreateFulfillmentResponse create(CreateFulfillmentRequest request) {
        Fulfillment fulfillment = new Fulfillment();
        fulfillment.orderId = request.orderId;
        fulfillment.id = UUID.randomUUID().toString();
        fulfillment.items = request.items;
        fulfillment.status = Status.valueOf("PENDING");
        fulfillmentCollection.insert(fulfillment);
        CreateFulfillmentResponse createFulfillmentResponse = new CreateFulfillmentResponse();
        //orderId won't show in response
        createFulfillmentResponse.id = fulfillment.id;
        createFulfillmentResponse.items = request.items;
        createFulfillmentResponse.status = "PENDING";
        return createFulfillmentResponse;
    }

    public ReadFulfillmentResponse get(String id) {
        Fulfillment fulfillment = fulfillmentCollection.get(id).orElseThrow(() -> new NotFoundException("can't get fulfillment with id: " + id));
        ReadFulfillmentResponse readFulfillmentResponse = new ReadFulfillmentResponse();
        //orderId won't show in response
        readFulfillmentResponse.id = fulfillment.id;
        readFulfillmentResponse.items = fulfillment.items;
        readFulfillmentResponse.status = fulfillment.status.toString();
        return readFulfillmentResponse;
    }

    public void delete(String id) {
        fulfillmentCollection.delete(id);
    }

    public SearchFulfillmentResponse search(SearchFulfillmentRequest request) {
        SearchFulfillmentResponse searchFulfillmentResponse = new SearchFulfillmentResponse();
        List<Bson> filters = new ArrayList<>();
        filters.add(eq("_id", request.id));
        filters.add(eq("orderId", request.orderId));
        filters.add(eq("items", request.items));
        filters.add(eq("status", request.status));
        searchFulfillmentResponse.fulfillments = fulfillmentCollection.find(and(filters))
                .stream().map(a -> {//这个是不是很没必要？直接用循环就行？
                    FulfillmentView fulfillmentView = new FulfillmentView();
                    fulfillmentView.id = a.id;
                    fulfillmentView.status = a.status.toString();
                    fulfillmentView.items = a.items;
                    return fulfillmentView;
                }).collect(Collectors.toList());
        searchFulfillmentResponse.total=searchFulfillmentResponse.fulfillments.size();
        return searchFulfillmentResponse;
    }
}