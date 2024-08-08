package learn.data;

import learn.models.Player;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Repository
public class PlayerRepository {
    private final RestTemplate restTemplate;

    @Value("${ballDontLie.api.url}")
    private String baseUrl;

    @Value("${ballDontLie.api.key}")
    private String apiKey;

    public PlayerRepository(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Player getPlayerById(Integer id) {
        String url = String.format("%s/players/%d?api_key=%s", baseUrl, id, apiKey);

        return restTemplate.getForObject(url, Player.class);
    }

    public List<Player> getPlayersByTeamId(Integer teamId) {
        String url = String.format("%s/players?api_key=%s&team_ids[]=%d", baseUrl, apiKey, teamId);

        ResponseEntity<List<Player>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Player>>() {}
        );

        return response.getBody();
    }

    public List<Player> searchPlayers(String search) {
        String url = String.format("%s/players?api_key=%s&search=%s", baseUrl, apiKey, search);

        ResponseEntity<List<Player>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Player>>() {}
        );

        return response.getBody();
    }
}
