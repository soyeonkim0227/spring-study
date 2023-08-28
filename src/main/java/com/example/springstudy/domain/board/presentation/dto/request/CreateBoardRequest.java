package com.example.springstudy.domain.board.presentation.dto.request;

import com.example.springstudy.domain.board.domain.type.Category;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CreateBoardRequest {

    @NotNull(message = "title은 Null 불가")
    @Size(max = 20, message = "title은 최대 20자")
    private String title;

    @NotNull(message = "content는 Null 불가")
    @Size(max = 500, message = "content는 최대 500자")
    private String content;

    @NotNull
    private Category category;
}
