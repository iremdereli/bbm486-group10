package com.doorstate.model.state;

import com.doorstate.exception.AlreadyClosedException;
import com.doorstate.exception.ClosedDoorCanNotBeUnlockedException;

public class ClosedDoorState implements IDoorState {
  @Override
  public IDoorState lock() {
    return new LockedDoorState();
  }

  @Override
  public IDoorState unlock() {
    throw new ClosedDoorCanNotBeUnlockedException();
  }

  @Override
  public IDoorState open() {
    return new OpenDoorState();
  }

  @Override
  public IDoorState close() {
    throw new AlreadyClosedException();
  }
}
