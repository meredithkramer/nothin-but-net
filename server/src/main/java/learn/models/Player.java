package learn.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Player {
    @JsonProperty("id")
    private int playerId;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    private Position position;
    private String height;
    private String weight;
    @JsonProperty("jersey_number")
    private String number;
    @JsonProperty("draft_year")
    private int draftYear;
    private Team team;

    public Player() {}

    public Player(int playerId, String firstName, String lastName, Position position, String height, String weight,
                  String number, int draftYear, Team team) {
        this.playerId = playerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.height = height;
        this.weight = weight;
        this.number = number;
        this.draftYear = draftYear;
        this.team = team;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getDraftYear() {
        return draftYear;
    }

    public void setDraftYear(int draftYear) {
        this.draftYear = draftYear;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return playerId == player.playerId && draftYear == player.draftYear && Objects.equals(firstName, player.firstName) && Objects.equals(lastName, player.lastName) && Objects.equals(position, player.position) && Objects.equals(height, player.height) && Objects.equals(weight, player.weight) && Objects.equals(number, player.number) && Objects.equals(team, player.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerId, firstName, lastName, position, height, weight, number, draftYear, team);
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", number='" + number + '\'' +
                ", draftYear=" + draftYear +
                ", team=" + team +
                '}';
    }
}
