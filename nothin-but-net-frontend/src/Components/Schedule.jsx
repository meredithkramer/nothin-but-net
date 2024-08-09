import React from "react";
import { useEffect, useState } from "react";

export default function Schedule() {
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
    <select>
      {teams.map((team) => (
        <option>{team.name}</option>
      ))}
    </select>
  );
}
