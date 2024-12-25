package com.microservices.apiGatway.dto;

import lombok.*;

@Data
@Setter
@Getter
@Builder
public class AuthResponse {
    private AuthRequest requestDTO;
    private AuthModel responseDTO;
    private String responseMessage;
}
