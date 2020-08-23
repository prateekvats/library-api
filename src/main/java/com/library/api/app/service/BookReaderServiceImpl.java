package com.library.api.app.service;

import com.library.api.app.service.dto.BookReaderDto;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class BookReaderServiceImpl implements BookReaderService
{
    @Override
    public boolean getBookReaderValidity(Long id)
    {
        return false;
    }

    @Override
    public BookReaderDto getBookReaderDetails(Long id)
    {
        return null;
    }

    @Override
    public List<BookReaderDto> getBookReadersByFirstName(String firstName)
    {
        return null;
    }

    @Override
    public List<BookReaderDto> getBookReadersByLastName(String lastName)
    {
        return null;
    }

    @Override
    public List<BookReaderDto> getBookReadersByFullName(String lastName)
    {
        return null;
    }
}
