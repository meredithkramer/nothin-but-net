package learn.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Conference {
    WEST("West"),
    EAST("East");

    private final String name;

    Conference(String name) {
        this.name = name;
    }

    @JsonValue
    public String getName() {
        return name;
    }

    @JsonCreator
    public static Conference fromName(String name) {
        for (Conference conference : values()) {
            if (conference.getName().equalsIgnoreCase(name)) {
                return conference;
            }
        }
        throw new IllegalArgumentException("Unknown Conference name: " + name);
    }
}
