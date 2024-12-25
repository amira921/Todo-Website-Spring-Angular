package com.microservices.apiGatway.controller;

import com.microservices.apiGatway.dto.*;
import com.microservices.apiGatway.service.AuthenticationService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todo-app")
@CrossOrigin(origins = "http://localhost:4200")
@Slf4j
@AllArgsConstructor
public class AuthenticationController {
    private AuthenticationService authenticationService;

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@Valid @RequestBody AuthRequest request){
        return ResponseEntity.ok(authenticationService.register(request));
    }
}
