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

    @GetMapping
    public ResponseEntity<List<Team>> getTeams(@RequestParam(required = false) String division) {
        List<Team> teams;
        if (division != null && !division.isEmpty()) {
            teams = service.getTeamsByDivision(division);
            if (teams.isEmpty()) {
                return ResponseEntity.notFound().build();
            }
        } else {
            teams = service.getAllTeams();
        }
        return ResponseEntity.ok(teams);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Team> getTeamById(@PathVariable int id) {
        Team team = service.getTeamById(id);

        if (team == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(team);
    }

}
