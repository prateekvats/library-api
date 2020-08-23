package com.library.api.app.persistence.repository;

import com.library.api.app.persistence.entity.BookIssueEntity;
import java.util.List;


public class BookIssueRepositoryImpl implements BookIssueRepository
{
    @Override
    public List<BookIssueEntity> getBookIssuesByName(String name)
    {
        return null;
    }

    @Override
    public List<BookIssueEntity> getBookIssuesByIssuer(String issuerName)
    {
        return null;
    }
}
