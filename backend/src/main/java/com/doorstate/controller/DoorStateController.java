package com.doorstate.controller;

import com.doorstate.model.Door;
import com.doorstate.model.state.OpenDoorState;
import com.doorstate.util.constant.ApiMessages;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoorStateController {
  public Door door = new Door(new OpenDoorState());

  @PostMapping(value = "lock")
  public ResponseEntity lock() {
    door.lock();
    return ResponseEntity.ok(ApiMessages.SUCCESS_MESSAGE);
  }

  @PostMapping(value = "open")
  public ResponseEntity open() {
    door.open();
    return ResponseEntity.ok(ApiMessages.SUCCESS_MESSAGE);
  }

  @PostMapping(value = "close")
  public ResponseEntity close() {
    door.close();
    return ResponseEntity.ok(ApiMessages.SUCCESS_MESSAGE);
  }

  @GetMapping(value = "state")
  public ResponseEntity getState() {
    return ResponseEntity.ok(door.getState().getClass().getSimpleName());
  }
}
