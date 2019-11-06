package app.customerservice.fulfillment.service;

import app.customerservice.api.fulfillment.CreateFulfillmentRequest;
import app.customerservice.api.fulfillment.CreateFulfillmentResponse;
import app.customerservice.api.fulfillment.FulfillmentStatusResponse;
import app.customerservice.api.fulfillment.FulfillmentView;
import app.customerservice.api.fulfillment.ReadFulfillmentResponse;
import app.customerservice.api.fulfillment.SearchFulfillmentRequest;
import app.customerservice.api.fulfillment.SearchFulfillmentResponse;
import app.customerservice.api.fulfillment.UpdateFulfillmentRequest;
import app.customerservice.api.fulfillment.UpdateFulfillmentResponse;
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
        searchFulfillmentResponse.fulfillments = fulfillmentCollection.find(and(filters))
            .stream().map(fulfillment -> {
                    FulfillmentView fulfillmentView = new FulfillmentView();
                fulfillmentView.id = fulfillment.id;
                fulfillmentView.status = fulfillment.status.toString();
                fulfillmentView.items = fulfillment.items;
                    return fulfillmentView;
                }).collect(Collectors.toList());
        searchFulfillmentResponse.total=searchFulfillmentResponse.fulfillments.size();
        return searchFulfillmentResponse;
    }

    public UpdateFulfillmentResponse cancel(UpdateFulfillmentRequest request) {
        return new UpdateFulfillmentResponse();
    }

    public FulfillmentStatusResponse getStatus(String id) {
        return new FulfillmentStatusResponse();
    }
}