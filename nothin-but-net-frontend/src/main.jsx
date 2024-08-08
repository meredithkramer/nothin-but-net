import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
import App from "./App.jsx";

// ! Note : Strict Mode may cause some hooks to run twice during development

createRoot(document.getElementById("root")).render(
  <StrictMode>
    <App />
  </StrictMode>
);
