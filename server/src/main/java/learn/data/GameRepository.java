package learn.data;

import com.fasterxml.jackson.databind.ObjectMapper;
import learn.models.Game;
import learn.models.Team;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class GameRepository {
    private final RestTemplate restTemplate;
    private String baseUrl = "https://api.balldontlie.io/v1";
    private String apiKey = "b9f46c28-06d5-4900-9038-ba121eca4023";

    public GameRepository(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Game> getGamesByTeamId(int gameId) {
        String url = String.format("%s/games?seasons[]=2023&team_ids[]=%s&per_page=100", baseUrl, gameId);

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", apiKey);
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<Map<String, Object>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<Map<String, Object>>() {}
        );

        Map<String, Object> body = response.getBody();
        if(body != null && body.containsKey("data")) {
            List<Map<String, Object>> teamsData = (List<Map<String, Object>>) body.get("data");
            return teamsData.stream().map(item -> new ObjectMapper().convertValue(item, Game.class)).collect(Collectors.toList());
        }

        return Collections.emptyList();
    }
}
