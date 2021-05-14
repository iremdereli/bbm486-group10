import React from "react";

export const Door = ({ doorState }) => {
  return (
    <div className="back-door">
      <div
        className={doorState === "OpenDoorState" ? "door door-open" : "door"}
      >
        {doorState === "LockedDoorState" ? (
          <i className="fas fa-lock fa-2x"></i>
        ) : (
          <i className="fas fa-lock-open fa-2x"></i>
        )}
      </div>
    </div>
  );
};
