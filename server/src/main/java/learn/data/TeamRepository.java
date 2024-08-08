package learn.data;

import learn.models.Team;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Repository
public class TeamRepository {
    private final RestTemplate restTemplate;

    @Value("${ballDontLie.api.url}")
    private String baseUrl;

    @Value("${ballDontLie.api.key}")
    private String key;

    public TeamRepository(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Team getTeamById(int id) {
        String url = String.format("%s/teams/%d?api_key=%s", baseUrl, id, key);

        return restTemplate.getForObject(url, Team.class);
    }

    public List<Team> getTeamsByDivision(String division) {
        String url = String.format("%s/teams?api_key=%s&division=%s", baseUrl, key, division);

        ResponseEntity<List<Team>> response = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<Team>>() {}
        );

        return response.getBody();
    }
}

