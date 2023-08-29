package com.example.springstudy.domain.board.service;

import com.example.springstudy.domain.board.domain.Board;
import com.example.springstudy.domain.board.domain.repository.BoardRepository;
import com.example.springstudy.domain.board.presentation.dto.request.CreateBoardRequest;
import com.example.springstudy.domain.board.presentation.dto.response.BoardIdResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class CreateBoardService {

    private final BoardRepository boardRepository;

    @Transactional
    public BoardIdResponse createBoard(CreateBoardRequest request) {
        Board board = boardRepository.save(Board.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .category(request.getCategory())
                .build());

        return new BoardIdResponse(board.getId());
    }
}
