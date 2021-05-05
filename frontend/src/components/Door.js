import React from "react";

export const Door = ({ doorState }) => {
  return (
    <div className="backDoor">
      <div
        className={doorState === "OpenDoorState" ? "door doorOpen" : "door"}
        style={{
          display: "flex",
          justifyContent: "flex-end",
          alignItems: "center",
        }}
      >
        {doorState === "LockedDoorState" ? (
          <i
            className="fas fa-lock fa-2x"
            style={{
              color: "white",
              marginRight: "15px",
            }}
          ></i>
        ) : (
          <i
            className="fas fa-lock-open fa-2x"
            style={{
              color: "white",
              marginRight: "15px",
            }}
          ></i>
        )}
      </div>
    </div>
  );
};
