package manhnv.dropwizard.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {

    @JsonProperty
    private int id;

    @JsonProperty
    private String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
