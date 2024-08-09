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

  const handleChange = function(event) {
    console.log('team changed!');
    console.log(event.target.options.selectedIndex);
  }
  return (
    <>
    <select onChange={handleChange}>
      <option disabled>Select a Team</option>
      {teams.map((team) => (
        <option key={team.id}>{team.name}</option>
      ))}
    </select>
    </>
  );
}
