package learn.controller;

import learn.domain.TeamService;
import learn.models.Team;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/team")
public class TeamController {
    private final TeamService service;

    public TeamController(TeamService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Team> getTeamById(@PathVariable int id) {
        Team team = service.getTeamById(id);

        if (team == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(team);
    }

    @GetMapping
    public ResponseEntity<List<Team>> getTeamsByDivision(@RequestParam String division) {
        List<Team> teams = service.getTeamsByDivision(division);

        if (teams.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(teams);
    }
}
