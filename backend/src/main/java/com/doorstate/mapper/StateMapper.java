package com.doorstate.mapper;

import com.doorstate.model.state.ClosedDoorState;
import com.doorstate.model.state.IDoorState;
import com.doorstate.model.state.LockedDoorState;
import com.doorstate.model.state.OpenDoorState;

public class StateMapper {
    public static String stateToString(IDoorState state) {
        if (state instanceof OpenDoorState) {
            return "OPENED";
        } else if (state instanceof ClosedDoorState) {
            return "CLOSED";
        } else if (state instanceof LockedDoorState) {
            return "LOCKED";
        }
        return "LOCKED";
    }
}
