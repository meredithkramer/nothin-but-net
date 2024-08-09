import logoBrand from "../images/logo-brand.png";

export default function Home() {
  return (
    <div className="home">
      <img src={logoBrand} />
      <h1>
        (Please don't be alarmed that the logo is so big, raw images are
        anarchists)
      </h1>
      <h1 className="home-header">
        Your one-stop-shop for information teams, stats, and upcoming schedules
      </h1>
    </div>
  );
}
