package learn.models;

import java.math.BigDecimal;
import java.util.Objects;

public class Stats {
    private int statsId;
    private Player player;
    private BigDecimal pts;
    private BigDecimal reb;
    private BigDecimal ast;
    private BigDecimal stl;
    private BigDecimal blk;
    private BigDecimal turnover;
    private int gamesPlayed;
    private String min;
    private BigDecimal fgPct;
    private BigDecimal fg3Pct;
    private BigDecimal ftPct;

    public Stats(int statsId, Player player, BigDecimal pts, BigDecimal reb, BigDecimal ast, BigDecimal stl,
                 BigDecimal blk, BigDecimal turnover, int gamesPlayed, String min, BigDecimal fgPct, BigDecimal fg3Pct, BigDecimal ftPct) {
        this.statsId = statsId;
        this.player = player;
        this.pts = pts;
        this.reb = reb;
        this.ast = ast;
        this.stl = stl;
        this.blk = blk;
        this.turnover = turnover;
        this.gamesPlayed = gamesPlayed;
        this.min = min;
        this.fgPct = fgPct;
        this.fg3Pct = fg3Pct;
        this.ftPct = ftPct;
    }

    public int getStatsId() {
        return statsId;
    }

    public void setStatsId(int statsId) {
        this.statsId = statsId;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player playerId) {
        this.player = playerId;
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

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
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
        return statsId == stats.statsId && player == stats.player && gamesPlayed == stats.gamesPlayed && Objects.equals(pts, stats.pts) && Objects.equals(reb, stats.reb) && Objects.equals(ast, stats.ast) && Objects.equals(stl, stats.stl) && Objects.equals(blk, stats.blk) && Objects.equals(turnover, stats.turnover) && Objects.equals(min, stats.min) && Objects.equals(fgPct, stats.fgPct) && Objects.equals(fg3Pct, stats.fg3Pct) && Objects.equals(ftPct, stats.ftPct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statsId, player, pts, reb, ast, stl, blk, turnover, gamesPlayed, min, fgPct, fg3Pct, ftPct);
    }

    @Override
    public String toString() {
        return "Stats{" +
                "statsId=" + statsId +
                ", player=" + player +
                ", pts=" + pts +
                ", reb=" + reb +
                ", ast=" + ast +
                ", stl=" + stl +
                ", blk=" + blk +
                ", turnover=" + turnover +
                ", gamesPlayed=" + gamesPlayed +
                ", min='" + min + '\'' +
                ", fgPct=" + fgPct +
                ", fg3Pct=" + fg3Pct +
                ", ftPct=" + ftPct +
                '}';
    }
}
