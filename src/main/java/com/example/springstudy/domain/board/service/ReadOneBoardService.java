package com.example.springstudy.domain.board.service;

import com.example.springstudy.domain.board.domain.Board;
import com.example.springstudy.domain.board.domain.repository.BoardRepository;
import com.example.springstudy.domain.board.exception.BoardNotFoundException;
import com.example.springstudy.domain.board.presentation.dto.response.BoardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class ReadOneBoardService {
    private final BoardRepository boardRepository;

    @Transactional(readOnly = true)
    public BoardResponse getOneBoard(Long boardId) {
        Board board = boardRepository.findById(boardId)
                .orElseThrow(() -> BoardNotFoundException.EXCEPTION);

        return new BoardResponse(board);
    }
}
