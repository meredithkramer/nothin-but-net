package learn.domain;

import learn.data.StatsRepository;
import learn.models.Stats;
import org.springframework.stereotype.Service;

@Service
public class StatsService {
    private final StatsRepository statsRepository;

    public StatsService(StatsRepository statsRepository) {
        this.statsRepository = statsRepository;
    }

    public Stats getStatsByPlayerId(int playerId) {
        return statsRepository.getStatsByPlayerId(playerId);
    }
}
