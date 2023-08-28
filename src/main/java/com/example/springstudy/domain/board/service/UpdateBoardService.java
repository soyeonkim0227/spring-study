package com.example.springstudy.domain.board.service;

import com.example.springstudy.domain.board.domain.Board;
import com.example.springstudy.domain.board.domain.repository.BoardRepository;
import com.example.springstudy.domain.board.presentation.dto.request.UpdateBoardRequest;
import com.example.springstudy.domain.board.presentation.dto.response.BoardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UpdateBoardService {

    private final BoardRepository boardRepository;

    @Transactional
    public BoardResponse modifyBoard(Long boardId, UpdateBoardRequest request) {
        Board board = boardRepository.findById(boardId)
                .orElseThrow(RuntimeException::new);
        
        board.modifyBoard(request.getTitle(), request.getContent());

        return new BoardResponse(boardId);
    }
}
