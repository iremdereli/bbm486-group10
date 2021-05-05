package com.doorstate.controller;

import com.doorstate.model.Door;
import com.doorstate.model.state.ClosedDoorState;
import com.doorstate.util.constant.ApiMessages;
import com.doorstate.util.constant.ApiMessagesPayload;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class DoorStateController {
  public final Door door = new Door(new ClosedDoorState());

  @PostMapping(value = "lock")
  public ResponseEntity<ApiMessagesPayload> lock() {
    door.lock();
    return ResponseEntity.ok(ApiMessages.createApiMessage(ApiMessages.SUCCESS_MESSAGE));
  }

  @PostMapping(value = "unlock")
  public ResponseEntity<ApiMessagesPayload> unlock() {
    door.unlock();
    return ResponseEntity.ok(ApiMessages.createApiMessage(ApiMessages.SUCCESS_MESSAGE));
  }

  @PostMapping(value = "open")
  public ResponseEntity<ApiMessagesPayload> open() {
    door.open();
    return ResponseEntity.ok(ApiMessages.createApiMessage(ApiMessages.SUCCESS_MESSAGE));
  }

  @PostMapping(value = "close")
  public ResponseEntity<ApiMessagesPayload> close() {
    door.close();
    return ResponseEntity.ok(ApiMessages.createApiMessage(ApiMessages.SUCCESS_MESSAGE));
  }

  @GetMapping(value = "state")
  public ResponseEntity<ApiMessagesPayload> getState() {
    return ResponseEntity.ok(
        ApiMessages.createApiMessage(door.getState().getClass().getSimpleName()));
  }
}
