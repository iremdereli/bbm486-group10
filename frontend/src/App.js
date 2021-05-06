import { useState, useEffect } from "react";
import "./App.css";
import { ButtonGroup } from "./components/ButtonGroup";
import { Door } from "./components/Door";
import { MessageContainer } from "./components/MessageContainer";
import * as Message from "./constants/Message";

const BASE_URL = "http://localhost:8080/";

function App() {
  const [doorState, setDoorState] = useState("ClosedDoorState");
  const [isLoading, setIsLoading] = useState(true);
  const [isError, setIsError] = useState(false);
  const [message, setMessage] = useState("");

  useEffect(() => {
    async function fetchData() {
      const response = await fetch(BASE_URL + "state");
      const body = await response.json();
      setDoorState(body.message);
    }
    fetchData();
    setIsLoading(false);
  }, []);

  const handleDoorStateChange = async (e) => {
    const buttonName = e.target.name;
    const response = await fetch(BASE_URL + buttonName, {
      method: "POST",
    });
    const body = await response.json();
    if (response.status === 200) {
      setIsError(false);
      switch (buttonName) {
        case "open":
          setDoorState("OpenDoorState");
          setMessage(Message.openDoor);
          break;
        case "close":
          setDoorState("ClosedDoorState");
          setMessage(Message.closeDoor);
          break;
        case "lock":
          setDoorState("LockedDoorState");
          setMessage(Message.lockDoor);
          break;
        case "unlock":
          setDoorState("ClosedDoorState");
          setMessage(Message.unlockDoor);
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
      <div className="container">
        <Door doorState={doorState} />
        <div className="button-group-container">
          <ButtonGroup
            names={["Open", "Close"]}
            onClick={handleDoorStateChange}
          />
          <ButtonGroup
            names={["Lock", "Unlock"]}
            onClick={handleDoorStateChange}
          />
        </div>
      </div>
      <hr className="rounded" />
      <MessageContainer message={message} isError={isError} />
    </div>
  );
}

export default App;
