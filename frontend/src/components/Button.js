import React from "react";

export const Button = ({ name, onClick, color }) => {
  return (
    <button
      name={name.toLowerCase()}
      onClick={onClick}
      style={{
        backgroundColor: color,
      }}
    >
      {name}
    </button>
  );
};
