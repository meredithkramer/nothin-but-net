import logoBrand from "../images/logo-brand.png";

export default function Home() {
  return (
    <div className="home">
      <img src={logoBrand} id="logo" />
      <div className="home-header-container">
        <h1 className="home-header">
          Your one-stop-shop for information teams, stats, and upcoming
          schedules
        </h1>
        <div id="home-header-underline"></div>
      </div>
      <div className="home-grid">
        <div className="home-card">
          <h3 className="home-card-hd">Latest Stats</h3>
          <p>
            Stay ahead of the game with our up-to-the-minute NBA stats. We
            provide real-time updates on player performances, team rankings, and
            game statistics, so you never miss a beat. Whether you're analyzing
            player efficiency or tracking team trends, our detailed and accurate
            data keeps you informed and engaged.
          </p>
        </div>
        <div className="home-card">
          <h3 className="home-card-hd">Up-to-the-Minute Scores</h3>
          <p>
            We deliver live score updates and real-time game action, so you’re
            always in the loop, no matter where you are. From buzzer-beaters to
            pivotal plays, our coverage ensures you catch every moment as it
            happens. Stay connected with instant updates on game results,
            quarter-by-quarter scores, and player highlights.
          </p>
        </div>
        <div className="home-card">
          <h3 className="home-card-hd">Comprehensive Coverage</h3>
          <p>
            Unparalleled NBA coverage that brings you closer to the game you
            love. From in-depth analysis and breaking news to game previews and
            post-game breakdowns, our coverage covers every angle of the NBA
            experience. Get detailed player profiles, team strategies, and
            insider insights that go beyond the headlines.
          </p>
        </div>
      </div>
      <div className="home-hidden">
        <p>Disclaimer:</p>
        <p>We don't actually do most of these things</p>
      </div>
    </div>
  );
}
