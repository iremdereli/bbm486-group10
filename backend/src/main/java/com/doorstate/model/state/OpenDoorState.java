package com.doorstate.model.state;

import com.doorstate.exception.AlreadyOpenedException;
import com.doorstate.exception.OpenedDoorCanNotBeLockedException;
import com.doorstate.exception.OpenedDoorCanNotBeUnlockedException;

public class OpenDoorState implements IDoorState {
    @Override
    public IDoorState lock() {
        throw new OpenedDoorCanNotBeLockedException();
    }

    @Override
    public IDoorState unlock() {
        throw new OpenedDoorCanNotBeUnlockedException();
    }

    @Override
    public IDoorState open() {
        throw new AlreadyOpenedException();
    }

    @Override
    public IDoorState close() {
        return new ClosedDoorState();
    }
}
