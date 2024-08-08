package learn.models;

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

    public String getName() {
        return name;
    }
}
