export default function ComingSoon() {
  return (
    <div className="coming-soon">
      {/* <h1 className="cs-header">Coming Soon</h1> */}
      <h1 className="cs-header" id="cs-sub-header">
        This feature is currently on our roadmap
      </h1>
      <div className="cs-header-underline"></div>
      <span>Questions, comments, or concerns? Feel free to </span>
      <span className="cs-fake-email">reach out to us</span>
    </div>
  );
}
