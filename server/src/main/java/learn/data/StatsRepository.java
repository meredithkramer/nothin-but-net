package learn.data;

import learn.models.Stats;
import learn.models.Team;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Repository
public class StatsRepository {
    private final RestTemplate restTemplate;

    @Value("${ballDontLie.api.url}")
    private String baseUrl;

    @Value("${ballDontLie.api.key}")
    private String apiKey;

    public StatsRepository(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Stats getStatsByPlayerId(int playerId) {
        String url = String.format("%s/season_averages?api_key=%s&season=2023&player_ids[]=%d", baseUrl, apiKey,
                playerId);

        return restTemplate.getForObject(url, Stats.class);
    }
}