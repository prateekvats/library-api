package com.library.api.app.controller;

import com.library.api.app.service.BookIssueService;
import com.library.api.app.service.BookIssueServiceImpl;
import com.library.api.app.service.BookStockServiceImpl;
import com.library.api.app.service.dto.BookIssueDto;
import com.library.api.app.service.dto.BookStockDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("admin")
public class LibrarianController
{
    @Autowired
    BookStockServiceImpl bookStockService;

    @Autowired
    BookIssueServiceImpl bookIssueService;

    @PostMapping("/addBook")
    public void addBookStock(@RequestBody BookStockDto bookStockDto)
    {
        bookStockService.addBookStock(bookStockDto);
    }

    @PostMapping("/issueBook")
    public void issueBook(@RequestBody BookIssueDto bookIssueDto)
    {
        bookIssueService.issueBook(bookIssueDto);
    }

}
