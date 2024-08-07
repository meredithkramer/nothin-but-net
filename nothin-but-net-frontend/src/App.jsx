import {BrowserRouter as Router, Routes, Route} from 'react-router-dom';
import Header from './Components/Header'
import Teams from './Components/Teams'
import Schedule from './Components/Schedule'
import Stats from './Components/Stats'
import Standings from './Components/Standings'
import Seasons from './Components/Seasons'
import './App.css'
function App() {

  return (
    <Router>
      <Header/>
      <Routes>
        <Route path='teams' element={<Teams/>} />
        <Route path='schedule' element={<Schedule/>} />
        <Route path='stats' element={<Stats/>} />
        <Route path='standings' element={<Standings/>} />
        <Route path='seasons' element={<Seasons/>} />
      </Routes>
    </Router>
  )
}

export default App
