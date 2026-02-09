import { lazy, Suspense } from "react";
import { BrowserRouter, Routes, Route, useNavigate } from "react-router-dom";

const Landing = lazy(() => import("./components/Landing"));
const Dashboard = lazy(() => import("./components/dashboard"));

function App() {
  return (
    <BrowserRouter>
      <Appbar />
      <Suspense fallback={<h2>Loading...</h2>}>
        <Routes>
          <Route path="/" element={<Landing />} />
          <Route path="/dashboard" element={<Dashboard />} />
        </Routes>
      </Suspense>
    </BrowserRouter>
  );
}

function Appbar() {
  const navigate = useNavigate();

  return (
    <div>
      <button
        onClick={() => navigate("/")}
        style={{ padding: 10, margin: 10 }}
      >
        Landing
      </button>

      <button
        onClick={() => navigate("/dashboard")}
        style={{ padding: 10, margin: 10 }}
      >
        Dashboard
      </button>
    </div>
  );
}

export default App;
