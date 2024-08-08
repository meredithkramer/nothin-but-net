package learn.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Position {
    F("F"),
    G("G"),
    C("C"),
    G_F("G-F"),
    F_G("F-G"),
    F_C("F-C"),
    C_F("C-F");

    private final String name;

    Position(String name) {
        this.name = name;
    }

    @JsonValue
    public String getName() {
        return name;
    }

    @JsonCreator
    public static Position fromName(String name) {
        if (name == null || name.isEmpty()) {
            return null;
        }
        for (Position position : values()) {
            if (position.getName().equalsIgnoreCase(name)) {
                return position;
            }
        }
        throw new IllegalArgumentException("Unknown Position name: " + name);
    }
}
