package com.example.springstudy.domain.service.user;


import com.example.springstudy.domain.persistence.User;
import com.example.springstudy.domain.persistence.repository.UserRepository;
import com.example.springstudy.domain.presentation.dto.request.SignUpRequest;
import com.example.springstudy.domain.service.exception.user.UserAlreadyExistsException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void signup(SignUpRequest request) {

        if (userRepository.existsByUsername(request.getUsername())) {
            throw UserAlreadyExistsException.EXCEPTION;
        }

        userRepository.save(User.builder()
                        .username(request.getUsername())
                        .email(request.getEmail())
                        .password(request.getPassword())
                .build());
    }
}
