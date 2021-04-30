package com.doorstate.controller;

import com.doorstate.model.Door;
import com.doorstate.model.state.ClosedDoorState;
import com.doorstate.util.constant.ApiMessages;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoorStateController {
  public final Door door = new Door(new ClosedDoorState());

  @PostMapping(value = "lock")
  public ResponseEntity<String> lock() {
    door.lock();
    return ResponseEntity.ok(ApiMessages.SUCCESS_MESSAGE);
  }

  @PostMapping(value = "unlock")
  public ResponseEntity<String> unlock() {
    door.unlock();
    return ResponseEntity.ok(ApiMessages.SUCCESS_MESSAGE);
  }

  @PostMapping(value = "open")
  public ResponseEntity<String> open() {
    door.open();
    return ResponseEntity.ok(ApiMessages.SUCCESS_MESSAGE);
  }

  @PostMapping(value = "close")
  public ResponseEntity<String> close() {
    door.close();
    return ResponseEntity.ok(ApiMessages.SUCCESS_MESSAGE);
  }

  @GetMapping(value = "state")
  public ResponseEntity<String> getState() {
    return ResponseEntity.ok(door.getState().getClass().getSimpleName());
  }
}
