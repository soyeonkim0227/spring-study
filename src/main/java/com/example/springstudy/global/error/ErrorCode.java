package com.example.springstudy.global.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    // user
    USER_ALREADY_EXISTS(409, "User already exists"),

    // board
    BOARD_NOT_FOUND(404, "Board not found"),
    BOARD_WRITER_MISMATCH(403, "Board writer misMatch"),

    // general
    INTERNAL_SERVER_ERROR(500, "Internal server error");

    private final int status;
    private final String message;
}
