package com.bbm486group10.controller;

import com.bbm486group10.model.state.OpenDoorState;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

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
}
