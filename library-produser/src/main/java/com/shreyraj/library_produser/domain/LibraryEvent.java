package com.shreyraj.library_produser.domain;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record LibraryEvent(Integer LibraryEventId,
                           LibraryEventType libraryEventType,
                           @NotNull
                           @Valid
                           Book book) {
}
