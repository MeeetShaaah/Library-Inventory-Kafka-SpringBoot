package com.shreyraj.library_produser.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record Book(
        @NotNull
        Integer bookId,
        @NotBlank
        String bookName,
        @NotBlank
        String bookAuthor) {
}
