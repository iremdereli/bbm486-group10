package com.doorstate.model.baddesign;

import com.doorstate.exception.*;

public class BadDesignDoorV2 {
  private BadDesignStateEnum state;

  public BadDesignDoorV2(BadDesignStateEnum state) {
    this.state = state;
  }

  public void lock() {
    if (state == BadDesignStateEnum.LOCKED) {
      throw new AlreadyLockedException();
    } else if (state == BadDesignStateEnum.OPEN) {
      throw new OpenedDoorCanNotBeLockedException();
    } else if (state == BadDesignStateEnum.CLOSED) {
      setState(BadDesignStateEnum.LOCKED);
    }
  }

  public void unlock() {
    if (state == BadDesignStateEnum.LOCKED) {
      setState(BadDesignStateEnum.CLOSED);
    } else if (state == BadDesignStateEnum.OPEN) {
      throw new LockedDoorCanNotBeOpenedException();
    } else if (state == BadDesignStateEnum.CLOSED) {
      throw new ClosedDoorCanNotBeUnlockedException();
    }
  }

  public void open() {
    if (state == BadDesignStateEnum.LOCKED) {
      throw new LockedDoorCanNotBeOpenedException();
    } else if (state == BadDesignStateEnum.OPEN) {
      throw new AlreadyOpenedException();
    } else if (state == BadDesignStateEnum.CLOSED) {
      setState(BadDesignStateEnum.OPEN);
    }
  }

  public void close() {
    if (state == BadDesignStateEnum.LOCKED) {
      throw new LockedDoorCanNotBeClosedException();
    } else if (state == BadDesignStateEnum.OPEN) {
      setState(BadDesignStateEnum.CLOSED);
    } else if (state == BadDesignStateEnum.CLOSED) {
      throw new AlreadyClosedException();
    }
  }

  public BadDesignStateEnum getState() {
    return state;
  }

  public void setState(BadDesignStateEnum state) {
    this.state = state;
  }
}
