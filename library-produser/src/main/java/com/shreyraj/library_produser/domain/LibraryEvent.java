package com.shreyraj.library_produser.domain;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record LibraryEvent(Integer libraryEventId,
                           LibraryEventType libraryEventType,
                           @NotNull
                           @Valid
                           Book book) {
}
