package learn.models;

import java.util.Objects;

public class Team {

    private int teamId;
    private String conference;
    private String division;
    private String city;
    private String name;
    private String fullName;
    private String abbreviation;

    public Team(int teamId, String abbreviation, String city, String conference, String division, String fullName,
                String name) {
        this.teamId = teamId;
        this.abbreviation = abbreviation;
        this.city = city;
        this.conference = conference;
        this.division = division;
        this.fullName = fullName;
        this.name = name;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
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

    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
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
        return Objects.equals(teamId, team.teamId) && Objects.equals(abbreviation, team.abbreviation) && Objects.equals(city, team.city) && Objects.equals(conference, team.conference) && Objects.equals(division, team.division) && Objects.equals(fullName, team.fullName) && Objects.equals(name, team.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamId, abbreviation, city, conference, division, fullName, name);
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + teamId +
                ", abbreviation='" + abbreviation + '\'' +
                ", city='" + city + '\'' +
                ", conference='" + conference + '\'' +
                ", division='" + division + '\'' +
                ", full_name='" + fullName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
