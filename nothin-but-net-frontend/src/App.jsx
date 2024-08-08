import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Header from "./Components/Header";
import Teams from "./Components/Teams";
import Schedule from "./Components/Schedule";
import Stats from "./Components/Stats";
import Standings from "./Components/Standings";
import Seasons from "./Components/Seasons";
import NotFound from "./Components/NotFound";
import Home from "./Components/Home";
import "./App.css";

export default function App() {
  return (
    <Router>
      <Header />
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="teams" element={<Teams />} />
        <Route path="schedule" element={<Schedule />} />
        <Route path="stats" element={<Stats />} />
        <Route path="standings" element={<Standings />} />
        <Route path="seasons" element={<Seasons />} />
        <Route path="*" element={<NotFound />} />
      </Routes>
    </Router>
  );
}
