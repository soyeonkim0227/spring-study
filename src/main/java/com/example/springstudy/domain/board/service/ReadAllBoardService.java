package com.example.springstudy.domain.board.service;

import com.example.springstudy.domain.board.domain.repository.BoardRepository;
import com.example.springstudy.domain.board.presentation.dto.response.BoardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ReadAllBoardService {

    private final BoardRepository boardRepository;

    // readOnly 옵션을 사용함으로써 조회 속도가 개선됨.
    @Transactional(readOnly = true)
    public List<BoardResponse> getAllBoards() {
        return boardRepository.findAll()
                .stream()
                .map(BoardResponse::new)
                .collect(Collectors.toList());
    }
}
