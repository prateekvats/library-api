package com.library.api.app.service.dto;

import java.time.OffsetDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class BookReaderDto
{
    private Long id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private OffsetDateTime membershipExpiration;
}
