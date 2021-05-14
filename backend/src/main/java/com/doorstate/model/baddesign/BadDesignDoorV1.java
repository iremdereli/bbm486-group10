package com.doorstate.model.baddesign;

import com.doorstate.exception.*;

public class BadDesignDoorV1 {
  private String state;

  public BadDesignDoorV1(String state) {
    this.state = state;
  }

  public void lock() {
    if (state.equals("Locked")) {
      throw new AlreadyLockedException();
    } else if (state.equals("Open")) {
      throw new OpenedDoorCanNotBeLockedException();
    } else if (state.equals("Closed")) {
      setState("Locked");
    }
  }

  public void unlock() {
    if (state.equals("Locked")) {
      setState("Closed");
    } else if (state.equals("Open")) {
      throw new LockedDoorCanNotBeOpenedException();
    } else if (state.equals("Closed")) {
      throw new ClosedDoorCanNotBeUnlockedException();
    }
  }

  public void open() {
    if (state.equals("Locked")) {
      throw new LockedDoorCanNotBeOpenedException();
    } else if (state.equals("Open")) {
      throw new AlreadyOpenedException();
    } else if (state.equals("Closed")) {
      setState("Open");
    }
  }

  public void close() {
    if (state.equals("Locked")) {
      throw new LockedDoorCanNotBeClosedException();
    } else if (state.equals("Open")) {
      setState("Closed");
    } else if (state.equals("Closed")) {
      throw new AlreadyClosedException();
    }
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }
}
