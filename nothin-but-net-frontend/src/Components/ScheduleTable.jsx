import { useEffect, useState } from "react";

export default function ScheduleTable({ teamId }) {

    const [games, setGames] = useState([]);

    useEffect(() => {
        const fetchGames = async () => {
          const response = await fetch(`http://localhost:8080/games/${teamId}`);
          if (response.ok) {
            setGames(await response.json());
          } else {
            setGames([]);
          }
        };
    
        fetchGames();
      }, [teamId]);

  return (
    <table className="table table-striped">
      <thead>
        <tr>
          <th>Date</th>
          <th>Home</th>
          <th>Away</th>
        </tr>
      </thead>
      <tbody>
        {games.map((game) => (
          <tr key={game.id}>
            <td>{game.date}</td>
            <td>{game.home_team.name} {game.home_team_score}</td>
            <td>{game.visitor_team.name} {game.visitor_team_score}</td>
          </tr>
        ))}
      </tbody>
    </table>
  );
}
