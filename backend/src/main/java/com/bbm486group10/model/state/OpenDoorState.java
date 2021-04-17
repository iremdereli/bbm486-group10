package com.bbm486group10.model.state;

import com.bbm486group10.exception.AlreadyOpenedException;
import com.bbm486group10.exception.OpenedDoorCanNotBeLockedException;
import com.bbm486group10.exception.OpenedDoorCanNotBeUnlockedException;

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
