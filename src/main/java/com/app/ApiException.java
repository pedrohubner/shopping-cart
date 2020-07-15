package com.app;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
class ApiException {

    private String message;
    private HttpStatus status;
    private String suggestion;
}
