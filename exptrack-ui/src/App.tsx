import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Sidebar from "./components/sidebar/Sidebar";
import ExpensePage from "./pages/ExpensePage";
import "./styles/app.css";
import { useSelector } from "react-redux";

const App = () => {
  const state = useSelector((state) => state);

  return (
    <div className="app">
      <Router>
        <Sidebar />
        <Routes>
          <Route path="/expense" element={<ExpensePage></ExpensePage>}></Route>
        </Routes>
      </Router>
    </div>
  );
};

export default App;
