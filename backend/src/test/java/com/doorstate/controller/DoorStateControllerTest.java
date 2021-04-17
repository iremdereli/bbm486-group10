package com.doorstate.controller;

import com.doorstate.exception.AlreadyClosedException;
import com.doorstate.model.state.ClosedDoorState;
import com.doorstate.model.state.OpenDoorState;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

@ExtendWith(MockitoExtension.class)
class DoorStateControllerTest {
    @InjectMocks
    DoorStateController doorStateController;

    @Test
    void it_should_return_success_when_open_closed_door() {
        //Arrange
        doorStateController.door.setState(new OpenDoorState());
        //Act
        ResponseEntity responseEntity = doorStateController.close();
        //Assert
        assertThat(responseEntity.getStatusCodeValue()).isEqualTo(200);
    }

    @Test
    void it_should_throw_already_closed_exception_when_close_closed_door() {
        //Arrange
        doorStateController.door.setState(new ClosedDoorState());
        //Act
        Throwable exception = catchThrowable(() -> doorStateController.close());
        //Assert
        assertThat(exception).isInstanceOf(AlreadyClosedException.class);
    }
}
