package com.example.springstudy.domain.presentation.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SignUpRequest {

    @NotNull(message = "아이디를 입력하세요.")
    @Size(min = 4, max = 20, message = "아이디는 4~20자여야 합니다.")
    private String username;

    @NotNull(message = "이메일을 입력하세요.")
    @Email
    private String email;

    @NotNull(message = "비밀번호를 입력하세요.")
    private String password;
}
