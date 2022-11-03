package org.efa.backend.exceptions.custom;

import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NotFoundException extends Exception {

    @Builder
    public NotFoundException(String message, Throwable ex) {
        super(message, ex);
    }

    @Builder
    public NotFoundException(String message) {
        super(message);
    }

    @Builder
    public NotFoundException(Throwable ex) {
        super(ex.getMessage(), ex);
    }

}