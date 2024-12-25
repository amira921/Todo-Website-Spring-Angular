package com.microservices.apiGatway.service;

import com.microservices.apiGatway.dto.*;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
@AllArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService{
    private final RestTemplate restTemplate;

    @Override
    public AuthResponse register(AuthRequest request) {
        String url = AuthenticationService.authenticationService + AuthenticationService.registerEndPoint;
        ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);
        return AuthResponse.builder()
                .responseMessage(response.toString())
                .build();
    }
}
