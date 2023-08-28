package com.example.springstudy.domain.board.presentation;

import com.example.springstudy.domain.board.presentation.dto.request.CreateBoardRequest;
import com.example.springstudy.domain.board.service.CreateBoardService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/board")
@RestController
public class BoardController {
    private final CreateBoardService createBoardService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void createBoard(@RequestBody @Valid CreateBoardRequest request) {
        createBoardService.createBoard(request);
    }
}
