package com.doorstate.model.state;

public interface IDoorState {
    IDoorState lock();

    IDoorState unlock();

    IDoorState open();

    IDoorState close();
}
