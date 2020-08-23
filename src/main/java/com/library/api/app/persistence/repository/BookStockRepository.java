package com.library.api.app.persistence.repository;

import com.library.api.app.persistence.entity.BookStockEntity;
import java.util.List;


public interface BookStockRepository
{
    BookStockEntity getBookStockById(Long id);

    List<BookStockEntity> getBookStockByName(String name);
}
