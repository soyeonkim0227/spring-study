package com.example.springstudy.domain.presentation.dto.response;

import com.example.springstudy.domain.persistence.Board;
import com.example.springstudy.domain.persistence.type.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class BoardResponse {
    private Long id;

    private String title;

    private String content;

    private Category category;

    public BoardResponse(Board board) {
        id = board.getId();
        title = board.getTitle();
        content = board.getContent();
        category = board.getCategory();
    }
}
