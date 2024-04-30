package com.authentication.validation;

import lombok.*;

@Data
@AllArgsConstructor
@Builder
public class ValidationError {
    private String field;
    private String message;
}