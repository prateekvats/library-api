package com.library.api.app.controller;

import com.library.api.app.service.dto.BookIssueDto;
import com.library.api.app.service.dto.BookReaderDto;
import com.library.api.app.service.dto.BookStockDto;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/bookIssuer")
public class BookIssuerController
{
    @GetMapping("/books/{issuerId}")
    public List<BookStockDto> getBooksByIssuerId(Long issuerID)
    {
        BookStockDto bookStockDto = new BookStockDto();
        bookStockDto.setAuthor("Prateek");
        bookStockDto.setGenre("Adventure");
        bookStockDto.setTitle("The chronicles of a developer");
        bookStockDto.setId(12456L);
        bookStockDto.setPublisher("Some publishing company");

        return List.of(bookStockDto);
    }
}
