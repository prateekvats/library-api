package com.library.api.app.service;

import com.library.api.app.service.dto.BookIssueDto;
import org.springframework.stereotype.Service;


public interface BookIssueService
{
    void issueBook(BookIssueDto bookIssueDto);

    void returnBook(BookIssueDto bookIssueDto);
}
