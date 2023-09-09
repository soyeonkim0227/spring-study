package com.example.springstudy.domain.service.board;

import com.example.springstudy.domain.persistence.Board;
import com.example.springstudy.domain.persistence.repository.BoardRepository;
import com.example.springstudy.domain.exception.BoardNotFoundException;
import com.example.springstudy.domain.presentation.dto.request.UpdateBoardRequest;
import com.example.springstudy.domain.presentation.dto.response.BoardIdResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UpdateBoardService {

    private final BoardRepository boardRepository;

    @Transactional
    public BoardIdResponse modifyBoard(Long boardId, UpdateBoardRequest request) {
        Board board = boardRepository.findById(boardId)
                .orElseThrow(() -> BoardNotFoundException.EXCEPTION);

        board.modifyBoard(request.getTitle(), request.getContent());

        return new BoardIdResponse(boardId);
    }
}
