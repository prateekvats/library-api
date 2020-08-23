package com.library.api.app.persistence.repository;

import com.library.api.app.persistence.entity.BookReaderEntity;
import java.util.List;


public interface BookReaderRepository
{
    BookReaderEntity getBookReaderById(Long id);

    List<BookReaderEntity> getBookReaderByName(String firstName, String lastName);
}
