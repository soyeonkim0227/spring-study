package com.example.springstudy.domain.board.presentation.dto.request;

import com.example.springstudy.domain.board.domain.type.Category;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UpdateBoardRequest {

    @NotBlank
    @Size(max = 20)
    private String title;

    @NotBlank
    @Size(max = 500)
    private String content;

}
