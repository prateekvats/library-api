package com.library.api.app.service;

import com.library.api.app.service.dto.BookStockDto;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;


@Service
public class BookStockServiceImpl implements BookStockService
{
    @Override
    public void updateBookStock(BookStockDto bookStockDto)
    {

    }

    @Override
    public void addBookStock(BookStockDto bookStockDto)
    {

    }

    @Override
    public void deleteBookStock(Long bookId)
    {

    }

    @Override
    public BookStockDto getBookStockDetails(Long bookId)
    {
        Assert.notNull(bookId, () -> "Invalid Book Id");
        BookStockDto bookStockDto = new BookStockDto();
        bookStockDto.setTitle("Sample Book");
        bookStockDto.setPublisher("Sample Publisher");
        bookStockDto.setTitle("Sample title");
        bookStockDto.setAuthor("XYZ");
        bookStockDto.setId(bookId);
        bookStockDto.setGenre("Mystery");
        return bookStockDto;
    }

    @Override
    public List<BookStockDto> getAllBooks()
    {
        List<BookStockDto> books = new ArrayList<>();
        AtomicLong bookIds = new AtomicLong(1000);
        for (int i = 1; i <= 10; i++)
        {
            BookStockDto bookStockDto = new BookStockDto();
            bookStockDto.setTitle(String.format("Sample Book %d", i + 1));
            bookStockDto.setPublisher(String.format("Publiser %d", i + 1));
            bookStockDto.setTitle(String.format("Title %d", i + 1));
            bookStockDto.setAuthor("XYZ");
            bookStockDto.setId(bookIds.getAndIncrement());
            bookStockDto.setGenre("Mystery");
            books.add(bookStockDto);
        }
        return books;
    }

    @Override
    public List<BookStockDto> getBooksByAuthor(String author)
    {
        Assert.notNull(author, () -> "Invalid author");
        List<BookStockDto> books = new ArrayList<>();
        AtomicLong bookIds = new AtomicLong(1000);
        for (int i = 1; i <= 10; i++)
        {
            BookStockDto bookStockDto = new BookStockDto();
            bookStockDto.setTitle(String.format("Sample Book %d", i + 1));
            bookStockDto.setPublisher(String.format("Publiser %d", i + 1));
            bookStockDto.setTitle(String.format("Title %d", i + 1));
            bookStockDto.setId(bookIds.getAndIncrement());
            bookStockDto.setAuthor(author);
            bookStockDto.setGenre("Mystery");
            books.add(bookStockDto);
        }
        return books;
    }

    @Override
    public List<BookStockDto> getBooksByGenre(String genre)
    {
        Assert.notNull(genre, () -> "Invalid genre");
        List<BookStockDto> books = new ArrayList<>();
        AtomicLong bookIds = new AtomicLong(1000);
        for (int i = 1; i <= 10; i++)
        {
            BookStockDto bookStockDto = new BookStockDto();
            bookStockDto.setTitle(String.format("Sample Book %d", i + 1));
            bookStockDto.setPublisher(String.format("Publiser %d", i + 1));
            bookStockDto.setTitle(String.format("Title %d", i + 1));
            bookStockDto.setId(bookIds.getAndIncrement());
            bookStockDto.setAuthor("XYZ");
            bookStockDto.setGenre(genre);
            books.add(bookStockDto);
        }
        return books;
    }
}
