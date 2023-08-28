package com.example.springstudy.domain.board.presentation;

import com.example.springstudy.domain.board.presentation.dto.request.CreateBoardRequest;
import com.example.springstudy.domain.board.presentation.dto.request.UpdateBoardRequest;
import com.example.springstudy.domain.board.presentation.dto.response.BoardResponse;
import com.example.springstudy.domain.board.service.CreateBoardService;
import com.example.springstudy.domain.board.service.UpdateBoardService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/board")
@RestController
public class BoardController {
    private final CreateBoardService createBoardService;
    private final UpdateBoardService updateBoardService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void createBoard(@RequestBody @Valid CreateBoardRequest request) {
        createBoardService.createBoard(request);
    }

    @ResponseStatus(HttpStatus.OK)
    @PatchMapping("/{board-id}")
    public BoardResponse modifyBoard(@PathVariable("board-id") Long boardId, @RequestBody UpdateBoardRequest request) {
        return updateBoardService.modifyBoard(boardId, request);
    }
}
