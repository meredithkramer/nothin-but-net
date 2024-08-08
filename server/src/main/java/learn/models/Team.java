package learn.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Team {

    private int id;
    private Conference conference;
    private Division division;
    private String city;
    private String name;
    @JsonProperty("full_name")
    private String fullName;
    private String abbreviation;

    public Team() {}
    public Team(int id, String abbreviation, String city, Conference conference, Division division, String fullName,
                String name) {
        this.id = id;
        this.abbreviation = abbreviation;
        this.city = city;
        this.conference = conference;
        this.division = division;
        this.fullName = fullName;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Conference getConference() {
        return conference;
    }

    public void setConference(Conference conference) {
        this.conference = conference;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(id, team.id) && Objects.equals(abbreviation, team.abbreviation) && Objects.equals(city, team.city) && Objects.equals(conference, team.conference) && Objects.equals(division, team.division) && Objects.equals(fullName, team.fullName) && Objects.equals(name, team.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, abbreviation, city, conference, division, fullName, name);
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", abbreviation='" + abbreviation + '\'' +
                ", city='" + city + '\'' +
                ", conference='" + conference + '\'' +
                ", division='" + division + '\'' +
                ", full_name='" + fullName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
