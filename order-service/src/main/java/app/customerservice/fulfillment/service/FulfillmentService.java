package app.customerservice.fulfillment.service;

import app.customerservice.api.fulfillment.CreateFulfillmentRequest;
import app.customerservice.api.fulfillment.UpdateFulfillmentRequest;
import app.customerservice.api.fulfillment.*;
import app.customerservice.fulfillment.domain.Fulfillment;
import app.customerservice.fulfillment.domain.Status;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import core.framework.inject.Inject;
import core.framework.mongo.MongoCollection;
import org.bson.conversions.Bson;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FulfillmentService {
    @Inject
    MongoCollection<Fulfillment> fulfillmentCollection;

    public UpdateFulfillmentResponse update(String id, UpdateFulfillmentRequest request) {
        Fulfillment fulfillment = fulfillmentCollection.get(id).get();
        List<Bson> updates=new ArrayList<Bson>();
        if(request.id!=null) {
            updates.add(Updates.set("items", request.id));
        }
        if(request.items!=null) {
            updates.add(Updates.set("items", request.items));
        }
        if(request.status!=null) {
            updates.add(Updates.set("items", request.status));
        }
        if(updates.size()>0) {
            fulfillmentCollection.update(Filters.eq("_id", id), Updates.combine(updates));
        }
        //How do I respond? update完get会不会因为写入有lock而降低效率？那怎么respond能保证确实是更新后的数据呢？
        fulfillment = fulfillmentCollection.get(id).get();//这个能行么, 能拿到更新后的值么？
        UpdateFulfillmentResponse updateFulfillmentResponse = new UpdateFulfillmentResponse();
        updateFulfillmentResponse.id = fulfillment.id;
        updateFulfillmentResponse.items = fulfillment.items;
        updateFulfillmentResponse.status = fulfillment.status.toString();
        return updateFulfillmentResponse;
    }

    public CreateFulfillmentResponse create(CreateFulfillmentRequest request) {
        Fulfillment fulfillment = new Fulfillment();
        fulfillment.id = UUID.randomUUID().toString();
        fulfillment.items = request.items;
        fulfillment.status= Status.valueOf(request.status);
        fulfillmentCollection.insert(fulfillment);
        CreateFulfillmentResponse createFulfillmentResponse = new CreateFulfillmentResponse();
        createFulfillmentResponse.id = fulfillment.id;
        createFulfillmentResponse.items = request.items;
        createFulfillmentResponse.status = request.status;
        return createFulfillmentResponse;
    }

    public ReadFulfillmentResponse read(String id) {
        Fulfillment fulfillment = fulfillmentCollection.get(id).get();
        ReadFulfillmentResponse readFulfillmentResponse = new ReadFulfillmentResponse();
        readFulfillmentResponse.id = fulfillment.id;
        readFulfillmentResponse.items = fulfillment.items;
        readFulfillmentResponse.status = fulfillment.status.toString();
        return readFulfillmentResponse;
    }

    public void delete(String id) {
        fulfillmentCollection.delete(id);
    }
}