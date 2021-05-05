package com.doorstate.controller;

import com.doorstate.exception.*;
import com.doorstate.model.state.ClosedDoorState;
import com.doorstate.model.state.LockedDoorState;
import com.doorstate.model.state.OpenDoorState;
import com.doorstate.util.constant.ApiMessagesPayload;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

@ExtendWith(MockitoExtension.class)
class DoorStateControllerTest {
  @InjectMocks DoorStateController doorStateController;

  // Closed State
  @Test
  void it_should_return_success_when_open_closed_door() {
    // Arrange
    doorStateController.door.setState(new ClosedDoorState());
    // Act
    ResponseEntity<ApiMessagesPayload> responseEntity = doorStateController.open();
    // Assert
    assertThat(responseEntity.getStatusCodeValue()).isEqualTo(200);
    assertThat(responseEntity.getBody()).isEqualTo("Success");
  }

  @Test
  void it_should_throw_already_closed_exception_when_close_closed_door() {
    // Arrange
    doorStateController.door.setState(new ClosedDoorState());
    // Act
    Throwable exception = catchThrowable(() -> doorStateController.close());
    // Assert
    assertThat(exception).isInstanceOf(AlreadyClosedException.class);
  }

  @Test
  void it_should_throw_closed_door_can_not_be_unlocked_exception_when_unlock_closed_door() {
    // Arrange
    doorStateController.door.setState(new ClosedDoorState());
    // Act
    Throwable exception = catchThrowable(() -> doorStateController.unlock());
    // Assert
    assertThat(exception).isInstanceOf(ClosedDoorCanNotBeUnlockedException.class);
  }

  @Test
  void it_should_return_success_when_lock_closed_door() {
    // Arrange
    doorStateController.door.setState(new ClosedDoorState());
    // Act
    ResponseEntity<ApiMessagesPayload> responseEntity = doorStateController.lock();
    // Assert
    assertThat(responseEntity.getStatusCodeValue()).isEqualTo(200);
    assertThat(responseEntity.getBody()).isEqualTo("Success");
  }

  // Locked State
  @Test
  void it_should_throw_already_locked_exception_when_lock_locked_door() {
    // Arrange
    doorStateController.door.setState(new LockedDoorState());
    // Act
    Throwable exception = catchThrowable(() -> doorStateController.lock());
    // Assert
    assertThat(exception).isInstanceOf(AlreadyLockedException.class);
  }

  @Test
  void it_should_return_success_when_unlock_locked_door() {
    // Arrange
    doorStateController.door.setState(new LockedDoorState());
    // Act
    ResponseEntity<ApiMessagesPayload> responseEntity = doorStateController.unlock();
    // Assert
    assertThat(responseEntity.getStatusCodeValue()).isEqualTo(200);
    assertThat(responseEntity.getBody()).isEqualTo("Success");
  }

  @Test
  void it_should_throw_locked_door_can_not_be_opened_exception_when_open_locked_door() {
    // Arrange
    doorStateController.door.setState(new LockedDoorState());
    // Act
    Throwable exception = catchThrowable(() -> doorStateController.open());
    // Assert
    assertThat(exception).isInstanceOf(LockedDoorCanNotBeOpenedException.class);
  }

  @Test
  void it_should_throw_locked_door_can_not_be_closed_exception_when_close_locked_door() {
    // Arrange
    doorStateController.door.setState(new LockedDoorState());
    // Act
    Throwable exception = catchThrowable(() -> doorStateController.close());
    // Assert
    assertThat(exception).isInstanceOf(LockedDoorCanNotBeClosedException.class);
  }

  // Open State
  @Test
  void it_should_throw_opened_door_can_not_be_locked_exception_when_lock_open_door() {
    // Arrange
    doorStateController.door.setState(new OpenDoorState());
    // Act
    Throwable exception = catchThrowable(() -> doorStateController.lock());
    // Assert
    assertThat(exception).isInstanceOf(OpenedDoorCanNotBeLockedException.class);
  }

  @Test
  void it_should_throw_opened_door_can_not_be_unlocked_exception_when_unlock_open_door() {
    // Arrange
    doorStateController.door.setState(new OpenDoorState());
    // Act
    Throwable exception = catchThrowable(() -> doorStateController.unlock());
    // Assert
    assertThat(exception).isInstanceOf(OpenedDoorCanNotBeUnlockedException.class);
  }

  @Test
  void it_should_throw_already_opened_exception_when_open_open_door() {
    // Arrange
    doorStateController.door.setState(new OpenDoorState());
    // Act
    Throwable exception = catchThrowable(() -> doorStateController.open());
    // Assert
    assertThat(exception).isInstanceOf(AlreadyOpenedException.class);
  }

  @Test
  void it_should_return_success_when_close_open_door() {
    // Arrange
    doorStateController.door.setState(new OpenDoorState());
    // Act
    ResponseEntity<ApiMessagesPayload> responseEntity = doorStateController.close();
    // Assert
    assertThat(responseEntity.getStatusCodeValue()).isEqualTo(200);
    assertThat(responseEntity.getBody()).isEqualTo("Success");
  }

  @Test
  void it_should_return_state_when_get_state() {
    // Arrange
    doorStateController.door.setState(new OpenDoorState());
    // Act
    ResponseEntity<ApiMessagesPayload> responseEntity = doorStateController.getState();
    // Assert
    assertThat(responseEntity.getStatusCodeValue()).isEqualTo(200);
    assertThat(responseEntity.getBody()).isEqualTo("OpenDoorState");
  }
}
