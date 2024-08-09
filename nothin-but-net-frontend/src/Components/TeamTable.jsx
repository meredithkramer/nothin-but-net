function TeamTable({ teams }) {
    return (
        <table className="table table-striped">
            <thead>
                <tr>
                    <th>City</th>
                    <th>Team</th>
                    <th>Division</th>
                </tr>
            </thead>
            <tbody>
                {teams.map(team => (
                    <tr key={team.teamId}>
                        <td>{team.city}</td>
                        <td>{team.name}</td>
                        <td>{team.division}</td>
                    </tr>
                ))}
            </tbody>
        </table >
    );
}

export default TeamTable;