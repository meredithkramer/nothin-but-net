package learn.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Division {
    ATLANTIC("Atlantic"),
    CENTRAL("Central"),
    SOUTHEAST("Southeast"),
    NORTHWEST("Northwest"),
    PACIFIC("Pacific"),
    SOUTHWEST("Southwest");

    private final String name;

    Division(String name) {
        this.name = name;
    }

    @JsonValue
    public String getName() {
        return name;
    }

    @JsonCreator
    public static Division fromName(String name) {
        for (Division division : values()) {
            if (division.getName().equalsIgnoreCase(name)) {
                return division;
            }
        }
        throw new IllegalArgumentException("Unknown Division name: " + name);
    }
}
