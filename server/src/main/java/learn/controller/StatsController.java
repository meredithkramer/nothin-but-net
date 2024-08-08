package learn.controller;

import learn.domain.StatsService;
import learn.models.Stats;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stats")
public class StatsController {
    private final StatsService service;

    public StatsController(StatsService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Stats> getStatsByPlayerId(@PathVariable int id) {
        Stats stats = service.getStatsByPlayerId(id);

        if(stats == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(stats);
    }
}
