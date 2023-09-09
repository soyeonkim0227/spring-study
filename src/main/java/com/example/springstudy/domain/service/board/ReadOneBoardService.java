package com.example.springstudy.domain.service.board;

import com.example.springstudy.domain.persistence.Board;
import com.example.springstudy.domain.persistence.repository.BoardRepository;
import com.example.springstudy.domain.exception.BoardNotFoundException;
import com.example.springstudy.domain.presentation.dto.response.BoardResponse;
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
