import React from "react";
import { useEffect, useState } from "react";
import ScheduleTable from "./ScheduleTable";

export default function Schedule() {
  const [teams, setTeams] = useState([]);
  const [teamId, setTeamId] = useState(0);

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

  const handleChange = function(event) {
    setTeamId(event.target.options.selectedIndex);
  }
  return (
    <>
    <select onChange={handleChange}>
      <option disabled selected>Select a Team</option>
      {teams.map((team) => (
        <option key={team.id}>{team.name}</option>
      ))}
    </select>
    {teamId == 0 ? "Select Team" : <ScheduleTable teamId={teamId} />}
    </>
  );
}
