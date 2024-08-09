package learn.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Game {
    public int id;
    public String date;
    public int season;
    @JsonProperty("home_team_score")
    public int homeScore;
    @JsonProperty("visitor_team_score")
    public int visitorScore;
    @JsonProperty("home_team")
    public Team homeTeam;
    @JsonProperty("visitor_team")
    public Team visitorTeam;

    public Game(){}

    public Game(int id, String date, int season, int homeScore, int visitorScore, Team homeTeam, Team visitorTeam) {
        this.id = id;
        this.date = date;
        this.season = season;
        this.homeScore = homeScore;
        this.visitorScore = visitorScore;
        this.homeTeam = homeTeam;
        this.visitorTeam = visitorTeam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public int getVisitorScore() {
        return visitorScore;
    }

    public void setVisitorScore(int visitorScore) {
        this.visitorScore = visitorScore;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getVisitorTeam() {
        return visitorTeam;
    }

    public void setVisitorTeam(Team visitorTeam) {
        this.visitorTeam = visitorTeam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return id == game.id && season == game.season && homeScore == game.homeScore && visitorScore == game.visitorScore && Objects.equals(date, game.date) && Objects.equals(homeTeam, game.homeTeam) && Objects.equals(visitorTeam, game.visitorTeam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, season, homeScore, visitorScore, homeTeam, visitorTeam);
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", season=" + season +
                ", homeScore=" + homeScore +
                ", visitorScore=" + visitorScore +
                ", homeTeam=" + homeTeam +
                ", visitorTeam=" + visitorTeam +
                '}';
    }
}
