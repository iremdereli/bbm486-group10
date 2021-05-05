package com.doorstate.model;

import com.doorstate.model.state.IDoorState;

public class Door {
  private IDoorState state;

  public Door(IDoorState state) {
    this.state = state;
  }

  public void lock() {
    IDoorState newState = state.lock();
    setState(newState);
  }

  public void open() {
    IDoorState newState = state.open();
    setState(newState);
  }

  public void close() {
    IDoorState newState = state.close();
    setState(newState);
  }

  public void unlock() {
    IDoorState newState = state.unlock();
    setState(newState);
  }

  public IDoorState getState() {
    return state;
  }

  public void setState(IDoorState state) {
    this.state = state;
  }
}
