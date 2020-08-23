package com.library.api.app.service.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class BookStockDto
{
    private Long id;
    private String title;
    private String author;
    private String publisher;
    private String genre;
}
