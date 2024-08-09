function ScheduleTable({ games }) {
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
                {games.map(game => (
                    <tr key={game.id}>
                        <td>{game.city}</td>
                        <td>{game.name}</td>
                        <td>{game.division}</td>
                    </tr>
                ))}
            </tbody>
        </table >
    );
}

export default ScheduleTable;