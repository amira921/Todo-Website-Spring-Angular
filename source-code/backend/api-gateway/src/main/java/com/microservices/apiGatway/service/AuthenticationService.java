package com.microservices.apiGatway.service;

import com.microservices.apiGatway.dto.*;
import org.springframework.stereotype.Service;

@Service
public interface AuthenticationService {

    String authenticationService = "http://AUTHENTICATION-SERVICE/auth";
    String registerEndPoint = "/register";

    AuthResponse register(AuthRequest request);
}
