package com.example.springstudy.domain.service.board;

import com.example.springstudy.domain.persistence.Board;
import com.example.springstudy.domain.persistence.repository.BoardRepository;
import com.example.springstudy.domain.exception.BoardNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class DeleteBoardService {

    private final BoardRepository boardRepository;

    @Transactional
    public void deleteBoard(Long boardId) {
        Board board = boardRepository.findById(boardId)
                .orElseThrow(() -> BoardNotFoundException.EXCEPTION);

        boardRepository.delete(board);
    }
}
