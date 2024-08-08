package learn.domain;

import learn.data.PlayerRepository;
import learn.models.Player;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Player getPlayerById(Integer id) {
        return playerRepository.getPlayerById(id);
    }

    public List<Player> getPlayersByTeamId(Integer teamId) {
        return playerRepository.getPlayersByTeamId(teamId);
    }

    public List<Player> searchPlayers(String search) {
        return playerRepository.searchPlayers(search);
    }

}
