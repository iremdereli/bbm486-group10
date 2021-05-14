import React from "react";

export const Button = ({ name, onClick, color }) => {
  return (
    <button name={name.toLowerCase()} className={color} onClick={onClick}>
      {name}
    </button>
  );
};
