import { Link } from "react-router-dom";

export default function TeamTable({ teams }) {
  return (
    <table className="table" id="teams-table">
      <thead className="table-head">
        <tr>
          <th className="table-head-header">City</th>
          <th className="table-head-header">Team</th>
          <th className="table-head-header">Division</th>
          <th className="table-head-header">Schedule</th>
        </tr>
      </thead>
      <tbody>
        {teams.map((team) => (
          <tr key={team.id}>
            <td>{team.city}</td>
            <td>{team.name}</td>
            <td>{team.division}</td>
            <td>
              <Link className="table-button" to={`/schedule/${team.teamId}`}>
                2023 Schedule
              </Link>
            </td>
          </tr>
        ))}
      </tbody>
    </table>
  );
}
