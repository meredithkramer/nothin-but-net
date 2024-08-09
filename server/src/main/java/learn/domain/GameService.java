package learn.domain;

import learn.data.GameRepository;
import learn.models.Game;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<Game> getGamesByTeamId(int gameId) {
        return gameRepository.getGamesByTeamId(gameId);
    }
}
