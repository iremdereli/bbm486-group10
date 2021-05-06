import React from "react";

export const MessageContainer = ({ message, isError }) => {
  return message !== "" ? (
    <p className="message">
      <i
        className={
          isError ? "fas fa-exclamation-triangle fa-lg" : "fas fa-check fa-lg"
        }
      ></i>
      {message}
    </p>
  ) : null;
};
