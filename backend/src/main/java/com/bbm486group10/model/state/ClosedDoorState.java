package com.bbm486group10.model.state;

import com.bbm486group10.exception.AlreadyClosedException;
import com.bbm486group10.exception.ClosedDoorCanNotBeUnlockedException;

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
