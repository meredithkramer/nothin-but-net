import { Link } from "react-router-dom";

export default function TeamTable({ teams }) {
  return (
    <table className="table table-striped" id="teams-table">
      <thead>
        <tr>
          <th>City</th>
          <th>Team</th>
          <th>Division</th>
        </tr>
      </thead>
      <tbody>
        {teams.map((team) => (
          <tr key={team.id}>
            <td>{team.city}</td>
            <td>{team.name}</td>
            <td>{team.division}</td>
            <td>
              <Link
                className="btn btn-primary mb-3"
                to={`/schedule/${team.id}`}
              >
                2023 Schedule
              </Link>
            </td>
          </tr>
        ))}
      </tbody>
    </table>
  );
}
