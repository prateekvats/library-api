package com.library.api.app.controller;

import com.library.api.app.service.BookStockService;
import com.library.api.app.service.BookStockServiceImpl;
import com.library.api.app.service.dto.BookStockDto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/books")
public class BookStockController
{
    @Autowired
    private BookStockServiceImpl bookStockService;

    @GetMapping
    public List<BookStockDto> getAllBooks()
    {
        return bookStockService.getAllBooks();
    }

    @PutMapping
    public void updateBook(@RequestBody BookStockDto bookStockDto)
    {
        bookStockService.updateBookStock(bookStockDto);
    }

    @PostMapping
    public void addBook(@RequestBody BookStockDto bookStockDto)
    {
        bookStockService.addBookStock(bookStockDto);
    }

    @DeleteMapping("/{id}")
    public void addBook(@PathVariable("id") Long id)
    {
        bookStockService.deleteBookStock(id);
    }


}
