package learn.data;

import com.fasterxml.jackson.databind.ObjectMapper;
import learn.models.Stats;
import learn.models.Team;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Repository
public class StatsRepository {
    private final RestTemplate restTemplate;

    private final String baseUrl = System.getenv("api_url");
    private final String key = System.getenv("api_key");

    public StatsRepository(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Stats getStatsByPlayerId(int playerId) {
        String url = String.format("%s/season_averages?season=2023&player_ids[]=%d", baseUrl,
                playerId);

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", key); // Adjust based on API requirements
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<Map<String, Object>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<Map<String, Object>>() {}
        );

        Map<String, Object> body = response.getBody();
        if (body != null && body.containsKey("data")) {
            Map<String, Object> statsData = ((List<Map<String, Object>>) body.get("data")).get(0);
            return new ObjectMapper().convertValue(statsData, Stats.class);
        }
        return null;
    }
}