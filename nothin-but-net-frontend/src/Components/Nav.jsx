import { NavLink } from 'react-router-dom';

export default function Nav() {
  return (
    <nav className='navbar navbar-expand'>
      <div className='d-flex'>
        <NavLink className='navbar-brand' to='/'>
          Nothin' But Net
        </NavLink>
        <ul className='navbar-nav'>
          <li className='nav-item'>
            <NavLink className='nav-link' to='/teams'>
              Teams
            </NavLink>
          </li>
          <li className='nav-item'>
            <NavLink className='nav-link' to='/schedule'>
              Schedule
            </NavLink>
          </li>
          <li className='nav-item'>
            <NavLink className='nav-link' to='/stats'>
              Stats
            </NavLink>
          </li>
          <li className='nav-item'>
            <NavLink className='nav-link' to='/standings'>
              Standings
            </NavLink>
          </li>
          <li className='nav-item'>
            <NavLink className='nav-link' to='/seasons'>
              Seasons
            </NavLink>
          </li>
        </ul>
      </div>
    </nav>
  );
}