package learn.controller;

import learn.domain.GameService;
import learn.models.Game;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
@CrossOrigin(origins = {"http://localhost:5173"})
public class GameController {
    private final GameService service;

    public GameController(GameService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Game>> getGamesByTeamId(@PathVariable int id){
        List<Game> games = service.getGamesByTeamId(id);

        if(games.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(games);
    }
}
