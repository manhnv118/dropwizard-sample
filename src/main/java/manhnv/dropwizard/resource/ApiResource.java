package manhnv.dropwizard.resource;

import manhnv.dropwizard.model.Item;
import manhnv.dropwizard.model.ItemResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
public class ApiResource {

    @GET
    @Path("/list")
    public Response listAllItems() {
        List<Item> items = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            items.add(new Item(i, "Item " + i));
        }
        ItemResponse itemResponse = new ItemResponse();
        itemResponse.setItems(items);
        itemResponse.setStatus("OK");

        return Response.ok(itemResponse).build();
    }
}
