package learn.data;

import com.fasterxml.jackson.databind.ObjectMapper;
import learn.models.Team;
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
public class TeamRepository {
    private final RestTemplate restTemplate;

    private final String baseUrl = System.getenv("api_url");
    private final String key = System.getenv("api_key");

    public TeamRepository(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Team> getAllTeams() {
        String url = String.format("%s/teams", baseUrl);

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", key);
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<Map<String, Object>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<Map<String, Object>>() {}
        );

        Map<String, Object> body = response.getBody();
        System.out.println(body);
        if (body != null && body.containsKey("data")) {
            List<Map<String, Object>> teamsData = (List<Map<String, Object>>) body.get("data");
            return teamsData.stream()
                    .limit(30)
                    .map(item -> new ObjectMapper().convertValue(item, Team.class))
                    .collect(Collectors.toList());
        }
        return Collections.emptyList();
    }

    public Team getTeamById(int id) {
        String url = String.format("%s/teams/%d", baseUrl, id);

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", key);
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<Map<String, Object>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<Map<String, Object>>() {}
        );

        Map<String, Object> body = response.getBody();
        if (body != null && body.containsKey("data")) {
            Map<String, Object> teamData = (Map<String, Object>) body.get("data");
            return new ObjectMapper().convertValue(teamData, Team.class);
        }
        return null;
    }

    public List<Team> getTeamsByDivision(String division) {
        String url = String.format("%s/teams?division=%s", baseUrl, division);

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", key);
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<Map<String, Object>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<Map<String, Object>>() {}
        );

        Map<String, Object> body = response.getBody();
        if (body != null && body.containsKey("data")) {
            List<Map<String, Object>> teamsData = (List<Map<String, Object>>) body.get("data");
            return teamsData.stream()
                    .map(item -> new ObjectMapper().convertValue(item, Team.class))
                    .collect(Collectors.toList());
        }
        return Collections.emptyList();
    }
}

