import { useEffect, useState } from "react";

import TeamTable from "./TeamTable";

export default function Teams() {
  const [teams, setTeams] = useState([]);

  useEffect(() => {
    const fetchTeams = async () => {
      const response = await fetch("http://localhost:8080/team");
      if (response.ok) {
        setTeams(await response.json());
      } else {
        setTeams([]);
      }
    };

    fetchTeams();
  }, []);

  return (
    <>
      {teams.length == 0 ? (
        <div className="alert alert-warning py-4">Airball! No teams found!</div>
      ) : (
        <TeamTable teams={teams} />
      )}
    </>
  );
}
