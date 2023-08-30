package com.example.springstudy.global.error;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Builder
public class ErrorResponse {

    private final int status;
    private final String message;
}
