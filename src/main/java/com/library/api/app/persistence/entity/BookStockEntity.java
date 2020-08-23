package com.library.api.app.persistence.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class BookStockEntity
{
    private Long id;
    private String title;
    private String author;
    private String publisher;
    private String genre;
    private Long stockRemaining;
}
