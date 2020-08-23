package com.library.api.app.service.dto;

import java.time.OffsetDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class BookIssueDto
{
    private Long id;
    private BookStockDto bookStockDto;
    private BookReaderDto bookReaderDto;
    private OffsetDateTime issueDate;
    private OffsetDateTime returnDate;
}
