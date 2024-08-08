package learn.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Stats {
    @JsonProperty("player_id")
    private int playerId;
    private BigDecimal pts;
    private BigDecimal reb;
    private BigDecimal ast;
    private BigDecimal stl;
    private BigDecimal blk;
    private BigDecimal turnover;
    @JsonProperty("games_played")
    private int gamesPlayed;
    @JsonProperty("min")
    private String minutes;
    @JsonProperty("fg_pct")
    private BigDecimal fgPct;
    @JsonProperty("fg3_pct")
    private BigDecimal fg3Pct;
    @JsonProperty("ft_pct")
    private BigDecimal ftPct;

    public Stats() {}

    public Stats(int playerId, BigDecimal pts, BigDecimal reb, BigDecimal ast, BigDecimal stl,
                 BigDecimal blk, BigDecimal turnover, int gamesPlayed, String minutes, BigDecimal fgPct, BigDecimal fg3Pct, BigDecimal ftPct) {
        this.playerId = playerId;
        this.pts = pts;
        this.reb = reb;
        this.ast = ast;
        this.stl = stl;
        this.blk = blk;
        this.turnover = turnover;
        this.gamesPlayed = gamesPlayed;
        this.minutes = minutes;
        this.fgPct = fgPct;
        this.fg3Pct = fg3Pct;
        this.ftPct = ftPct;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public BigDecimal getPts() {
        return pts;
    }

    public void setPts(BigDecimal pts) {
        this.pts = pts;
    }

    public BigDecimal getReb() {
        return reb;
    }

    public void setReb(BigDecimal reb) {
        this.reb = reb;
    }

    public BigDecimal getAst() {
        return ast;
    }

    public void setAst(BigDecimal ast) {
        this.ast = ast;
    }

    public BigDecimal getStl() {
        return stl;
    }

    public void setStl(BigDecimal stl) {
        this.stl = stl;
    }

    public BigDecimal getBlk() {
        return blk;
    }

    public void setBlk(BigDecimal blk) {
        this.blk = blk;
    }

    public BigDecimal getTurnover() {
        return turnover;
    }

    public void setTurnover(BigDecimal turnover) {
        this.turnover = turnover;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }

    public BigDecimal getFgPct() {
        return fgPct;
    }

    public void setFgPct(BigDecimal fgPct) {
        this.fgPct = fgPct;
    }

    public BigDecimal getFg3Pct() {
        return fg3Pct;
    }

    public void setFg3Pct(BigDecimal fg3Pct) {
        this.fg3Pct = fg3Pct;
    }

    public BigDecimal getFtPct() {
        return ftPct;
    }

    public void setFtPct(BigDecimal ftPct) {
        this.ftPct = ftPct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stats stats = (Stats) o;
        return playerId == stats.playerId && gamesPlayed == stats.gamesPlayed && Objects.equals(pts, stats.pts) && Objects.equals(reb, stats.reb) && Objects.equals(ast, stats.ast) && Objects.equals(stl, stats.stl) && Objects.equals(blk, stats.blk) && Objects.equals(turnover, stats.turnover) && Objects.equals(minutes, stats.minutes) && Objects.equals(fgPct, stats.fgPct) && Objects.equals(fg3Pct, stats.fg3Pct) && Objects.equals(ftPct, stats.ftPct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerId, pts, reb, ast, stl, blk, turnover, gamesPlayed, minutes, fgPct, fg3Pct, ftPct);
    }

    @Override
    public String toString() {
        return "Stats{" +
                ", playerId=" + playerId +
                ", pts=" + pts +
                ", reb=" + reb +
                ", ast=" + ast +
                ", stl=" + stl +
                ", blk=" + blk +
                ", turnover=" + turnover +
                ", gamesPlayed=" + gamesPlayed +
                ", min='" + minutes + '\'' +
                ", fgPct=" + fgPct +
                ", fg3Pct=" + fg3Pct +
                ", ftPct=" + ftPct +
                '}';
    }
}
