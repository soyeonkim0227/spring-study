package com.example.springstudy.domain.service.board;

import com.example.springstudy.domain.persistence.Board;
import com.example.springstudy.domain.persistence.repository.BoardRepository;
import com.example.springstudy.domain.presentation.dto.request.CreateBoardRequest;
import com.example.springstudy.domain.presentation.dto.response.BoardIdResponse;
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
