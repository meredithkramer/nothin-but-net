package learn.domain;

import learn.data.TeamRepository;
import learn.models.Team;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public List<Team> getAllTeams() {
        return teamRepository.getAllTeams();
    }

    public Team getTeamById(Integer id) {
        return teamRepository.getTeamById(id);
    }

    public List<Team> getTeamsByDivision(String division) {
        return teamRepository.getTeamsByDivision(division);
    }
}
