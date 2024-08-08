package learn.models;

public enum Conference {
    WEST("West"),
    EAST("East");

    private final String name;

    Conference(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
