package com.bbm486group10.mapper;

import com.bbm486group10.model.state.ClosedDoorState;
import com.bbm486group10.model.state.IDoorState;
import com.bbm486group10.model.state.LockedDoorState;
import com.bbm486group10.model.state.OpenDoorState;

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
