package com.doorstate.util.constant;

public class ApiMessages {
  public static final String ALREADY_CLOSED_EXCEPTION = "Closed door can not be closed again.";
  public static final String ALREADY_LOCKED_EXCEPTION = "Locked door can not be locked again.";
  public static final String ALREADY_OPEN_EXCEPTION = "Open door can not be opened again.";
  public static final String CLOSED_DOOR_CAN_NOT_BE_UNLOCKED = "Closed door can not be unlocked.";
  public static final String LOCKED_DOOR_CAN_NOT_BE_OPENED = "Locked door can not be opened.";
  public static final String LOCKED_DOOR_CAN_NOT_BE_CLOSED = "Locked door can not be closed.";
  public static final String OPENED_DOOR_CAN_NOT_BE_LOCKED = "Open door can not be locked.";
  public static final String OPENED_DOOR_CAN_NOT_BE_UNLOCKED = "Open door can not be unlocked.";
  public static final String SUCCESS_MESSAGE = "Success";

  public static ApiMessagesPayload createApiMessage(String message) {
    return new ApiMessagesPayload(message);
  }
}
