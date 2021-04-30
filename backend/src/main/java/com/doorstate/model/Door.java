package com.doorstate.model;

import com.doorstate.model.state.IDoorState;

public class Door {
  private IDoorState state;

  public Door(IDoorState state) {
    this.state = state;
  }

  public void lock() {
    setState(state.lock());
  }

  public void open() {
    setState(state.open());
  }

  public void close() {
    setState(state.close());
  }

  public IDoorState getState() {
    return state;
  }

  public void setState(IDoorState state) {
    this.state = state;
  }
}
