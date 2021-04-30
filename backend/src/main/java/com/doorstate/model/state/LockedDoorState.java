package com.doorstate.model.state;

import com.doorstate.exception.AlreadyLockedException;
import com.doorstate.exception.LockedDoorCanNotBeClosedException;
import com.doorstate.exception.LockedDoorCanNotBeOpenedException;

public class LockedDoorState implements IDoorState {
  @Override
  public IDoorState lock() {
    throw new AlreadyLockedException();
  }

  @Override
  public IDoorState unlock() {
    return new ClosedDoorState();
  }

  @Override
  public IDoorState open() {
    throw new LockedDoorCanNotBeOpenedException();
  }

  @Override
  public IDoorState close() {
    throw new LockedDoorCanNotBeClosedException();
  }
}
