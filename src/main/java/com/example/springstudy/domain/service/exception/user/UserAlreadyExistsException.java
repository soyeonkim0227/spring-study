package com.example.springstudy.domain.service.exception.user;

import com.example.springstudy.global.error.CustomException;
import com.example.springstudy.global.error.ErrorCode;

public class UserAlreadyExistsException extends CustomException {
    public static final CustomException EXCEPTION = new UserAlreadyExistsException();
    private UserAlreadyExistsException() {
        super(ErrorCode.USER_ALREADY_EXISTS);
    }
}
