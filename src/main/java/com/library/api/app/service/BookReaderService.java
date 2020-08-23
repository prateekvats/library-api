package com.library.api.app.service;

import com.library.api.app.service.dto.BookReaderDto;
import java.util.List;
import org.springframework.stereotype.Service;


public interface BookReaderService
{
    boolean getBookReaderValidity(Long id);

    BookReaderDto getBookReaderDetails(Long id);

    List<BookReaderDto> getBookReadersByFirstName(String firstName);

    List<BookReaderDto> getBookReadersByLastName(String lastName);

    List<BookReaderDto> getBookReadersByFullName(String lastName);
}
