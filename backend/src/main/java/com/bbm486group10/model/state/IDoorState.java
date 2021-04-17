package com.bbm486group10.model.state;

public interface IDoorState {
    IDoorState lock();

    IDoorState unlock();

    IDoorState open();

    IDoorState close();
}
