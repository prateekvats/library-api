package com.library.api.app.persistence.repository;

import com.library.api.app.persistence.entity.BookIssueEntity;
import java.util.List;


public interface BookIssueRepository
{
    List<BookIssueEntity> getBookIssuesByName(String name);

    List<BookIssueEntity> getBookIssuesByIssuer(String issuerName);
}
