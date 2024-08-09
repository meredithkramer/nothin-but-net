package learn.data;

import com.fasterxml.jackson.databind.ObjectMapper;
import learn.models.Player;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class PlayerRepository {
    private final RestTemplate restTemplate;

    private String baseUrl = "https://api.balldontlie.io/v1";
    private String apiKey = "b9f46c28-06d5-4900-9038-ba121eca4023";

    public PlayerRepository(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Player getPlayerById(int id) {
        String url = String.format("%s/players/?player_ids[]=%d", baseUrl, id);

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

        if (body != null && body.containsKey("data")) {
            List<Map<String, Object>> data = (List<Map<String, Object>>) body.get("data");
            if (!data.isEmpty()) {
                return new ObjectMapper().convertValue(data.get(0), Player.class);
            }
        }
        return null;
    }

    public List<Player> getPlayersByTeamId(int teamId) {
        String url = String.format("%s/players?team_ids[]=%d", baseUrl, teamId);

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", apiKey); // Adjust based on API requirements
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<Map<String, Object>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<Map<String, Object>>() {}
        );

        Map<String, Object> body = response.getBody();
        if (body != null && body.containsKey("data")) {
            List<Map<String, Object>> data = (List<Map<String, Object>>) body.get("data");
            return data.stream()
                    .map(item -> new ObjectMapper().convertValue(item, Player.class))
                    .collect(Collectors.toList());
        }
        return Collections.emptyList();
    }

    public List<Player> searchPlayers(String search) {
        String url = String.format("%s/players?search=%s", baseUrl, search);

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", apiKey); // Adjust based on API requirements
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<Map<String, Object>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<Map<String, Object>>() {}
        );

        Map<String, Object> body = response.getBody();
        if (body != null && body.containsKey("data")) {
            List<Map<String, Object>> data = (List<Map<String, Object>>) body.get("data");
            return data.stream()
                    .map(item -> new ObjectMapper().convertValue(item, Player.class))
                    .collect(Collectors.toList());
        }
        return Collections.emptyList();
    }
}
