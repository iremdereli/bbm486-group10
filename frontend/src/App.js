import "./App.css";
import { useEffect, useState } from "react";
import { Button } from "./components/Button";
import { Door } from "./components/Door";

function App() {
  const [doorState, setDoorState] = useState("ClosedDoorState");
  const [isLoading, setIsLoading] = useState(true);
  const [isError, setIsError] = useState(false);
  const [message, setMessage] = useState("");

  useEffect(() => {
    async function fetchData() {
      const response = await fetch("http://localhost:8080/state");
      const body = await response.json();
      setDoorState(body.message);
    }
    fetchData();
    setIsLoading(false);
  }, []);

  const changeDoorState = async (e) => {
    const buttonName = e.target.name;
    const response = await fetch(`http://localhost:8080/${buttonName}`, {
      method: "POST",
    });
    const body = await response.json();
    if (response.status === 200) {
      setIsError(false);
      switch (buttonName) {
        case "open":
          setDoorState("OpenDoorState");
          setMessage("The door opened successfully.");
          break;
        case "close":
          setDoorState("ClosedDoorState");
          setMessage("The door closed successfully.");
          break;
        case "lock":
          setDoorState("LockedDoorState");
          setMessage("The door locked successfully.");
          break;
        case "unlock":
          setDoorState("ClosedDoorState");
          setMessage("The door unlocked successfully.");
          break;
      }
    } else {
      setIsError(true);
      setMessage(body.message);
    }
  };

  return (
    <div className="App">
      <p className="state">
        State: {isLoading ? "Loading..." : doorState.replace("DoorState", "")}
      </p>
      <hr className="rounded" />
      <div
        style={{
          display: "flex",
          justifyContent: "space-evenly",
        }}
      >
        <Door doorState={doorState} />
        <div
          style={{
            display: "flex",
            flexDirection: "column",
            justifyContent: "space-evenly",
          }}
        >
          <div
            style={{
              display: "flex",
              flexDirection: "column",
            }}
          >
            <Button name="Open" color="#1aae9f" onClick={changeDoorState} />
            <Button name="Close" color="#d3455a" onClick={changeDoorState} />
          </div>
          <div
            style={{
              display: "flex",
              flexDirection: "column",
            }}
          >
            <Button name="Lock" color="#1aae9f" onClick={changeDoorState} />
            <Button name="Unlock" color="#d3455a" onClick={changeDoorState} />
          </div>
        </div>
      </div>
      <hr className="rounded" />
      {message !== "" ? (
        <p className="message">
          <i
            className={
              isError
                ? "fas fa-exclamation-triangle fa-lg"
                : "fas fa-check fa-lg"
            }
          ></i>
          {message}
        </p>
      ) : null}
    </div>
  );
}

export default App;
