package com.example.springstudy.domain.board.domain;

import com.example.springstudy.domain.board.domain.type.Category;
import jakarta.persistence.*;
import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String title;

    @Column(length = 500, nullable = false)
    private String content;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Category category;

    @Builder
    public Board(String title, String content, Category category) {
        this.title = title;
        this.content = content;
        this.category = category;
    }
}
