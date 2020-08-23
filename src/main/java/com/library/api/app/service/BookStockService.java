package com.library.api.app.service;

import com.library.api.app.service.dto.BookStockDto;
import java.util.List;
import org.springframework.stereotype.Service;


public interface BookStockService
{
    void updateBookStock(BookStockDto bookStockDto);

    void addBookStock(BookStockDto bookStockDto);

    void deleteBookStock(Long bookId);

    BookStockDto getBookStockDetails(Long bookId);

    List<BookStockDto> getAllBooks();

    List<BookStockDto> getBooksByAuthor(String author);

    List<BookStockDto> getBooksByGenre(String genre);
}
