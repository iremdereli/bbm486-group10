import "./App.css";
import { useEffect } from "react";

function App() {
  useEffect(() => {
    fetch("http://localhost:8080/state", {
      method: "GET",
    }).then(async (res) => {
      console.log(res.status);
      console.log(await res.json());
    });
  });

  return (
    <div className="App">
      <p>State: </p>
      <div
        style={{
          display: "flex",
        }}
      >
        Door
      </div>
    </div>
  );
}

export default App;
