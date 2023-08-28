package com.example.springstudy.domain.board.service;

import com.example.springstudy.domain.board.domain.Board;
import com.example.springstudy.domain.board.domain.repository.BoardRepository;
import com.example.springstudy.domain.board.presentation.dto.request.CreateBoardRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class CreateBoardService {

    private final BoardRepository boardRepository;

    @Transactional
    public void createBoard(CreateBoardRequest request) {
        boardRepository.save(Board.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .category(request.getCategory())
                .build());
    }
}
