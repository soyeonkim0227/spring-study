package com.example.springstudy.domain.board.presentation;

import com.example.springstudy.domain.board.presentation.dto.request.CreateBoardRequest;
import com.example.springstudy.domain.board.presentation.dto.request.UpdateBoardRequest;
import com.example.springstudy.domain.board.presentation.dto.response.BoardIdResponse;
import com.example.springstudy.domain.board.presentation.dto.response.BoardResponse;
import com.example.springstudy.domain.board.service.CreateBoardService;
import com.example.springstudy.domain.board.service.DeleteBoardService;
import com.example.springstudy.domain.board.service.ReadOneBoardService;
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
    private final DeleteBoardService deleteBoardService;
    private final ReadOneBoardService readOneBoardService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public BoardIdResponse createBoard(@RequestBody @Valid CreateBoardRequest request) {
        return createBoardService.createBoard(request);
    }

    @ResponseStatus(HttpStatus.OK)
    @PatchMapping("/{board-id}")
    public BoardIdResponse modifyBoard(@PathVariable("board-id") Long boardId, @RequestBody @Valid UpdateBoardRequest request) {
        return updateBoardService.modifyBoard(boardId, request);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/{board-id}")
    public void deleteBoard(@PathVariable("board-id") Long boardId) {
        deleteBoardService.deleteBoard(boardId);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{board-id}")
    public BoardResponse getOneBoard(@PathVariable("board-id") Long boardId) {
        return readOneBoardService.getOneBoard(boardId);
    }
}
