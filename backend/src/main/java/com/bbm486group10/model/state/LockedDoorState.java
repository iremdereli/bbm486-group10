package com.bbm486group10.model.state;

import com.bbm486group10.exception.AlreadyLockedException;
import com.bbm486group10.exception.LockedDoorCanNotBeClosedException;
import com.bbm486group10.exception.LockedDoorCanNotBeOpenedException;

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
