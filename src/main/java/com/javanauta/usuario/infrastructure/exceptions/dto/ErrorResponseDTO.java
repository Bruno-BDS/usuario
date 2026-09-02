package com.javanauta.usuario.infrastructure.exceptions.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorResponseDTO {

    private LocalDateTime timestamp;
    private String message;
    private String error;
    private  int status;
    private String path;
}
