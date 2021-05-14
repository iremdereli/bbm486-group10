import React from "react";
import { Button } from "./Button";

export const ButtonGroup = ({ names, onClick }) => {
  const colors = ["positive", "negative"];
  return (
    <div className="button-group">
      {names.map((name, i) => {
        return <Button name={name} color={colors[i]} onClick={onClick} />;
      })}
    </div>
  );
};
