package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;

    @Builder
    public PostsSaveRequestDto(String _title, String _content, String _author) {
        this.title = _title;
        this.content = _content;
        this.author = _author;
    }

    public Posts toEntity() {
        return Posts.builder()
                ._title(title)
                ._content(content)
                ._author(author)
                .build();
    }
}
