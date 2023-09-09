package com.example.springstudy.domain.exception;

import com.example.springstudy.global.error.CustomException;
import com.example.springstudy.global.error.ErrorCode;

public class BoardNotFoundException extends CustomException {

    public static final CustomException EXCEPTION = new BoardNotFoundException();

    private BoardNotFoundException() {
        super(ErrorCode.BOARD_NOT_FOUND);
    }
}
