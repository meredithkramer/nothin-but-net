import { NavLink } from "react-router-dom";
import logoBrand from "../images/logo-brand.png";

export default function Nav() {
  return (
    <nav className="navbar">
      <div className="nav-start">
        <NavLink className="navbar-brand" to="/">
          <img src={logoBrand} className="nav-logo" />
        </NavLink>
        <ul className="navbar-nav">
          <li className="nav-item">
            <NavLink className="nav-link" to="/teams">
              Teams
            </NavLink>
          </li>
          <li className="nav-item">
            <NavLink className="nav-link" to="/schedule">
              Schedule
            </NavLink>
          </li>
          <li className="nav-item">
            <NavLink className="nav-link" to="/stats">
              Stats
            </NavLink>
          </li>
          <li className="nav-item">
            <NavLink className="nav-link" to="/standings">
              Standings
            </NavLink>
          </li>
          <li className="nav-item">
            <NavLink className="nav-link" to="/seasons">
              Seasons
            </NavLink>
          </li>
        </ul>
      </div>
    </nav>
  );
}
