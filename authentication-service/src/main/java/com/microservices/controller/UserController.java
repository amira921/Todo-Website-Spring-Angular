package com.microservices.controller;

import com.microservices.dto.*;
import com.microservices.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@AllArgsConstructor
@Slf4j
public class UserController {
    private final UserService service;

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@Valid @RequestBody RegistrationRequest newRequest) {
        RegistrationRequest request = service.register(newRequest);
        return (request != null) ?
                ResponseEntity.status(HttpStatus.CREATED)
                        .body("Your account has been successfully created with the email: " + request.getEmail() + "\n"
                        + "To activate your account, please check your email inbox to verify your email address")
                : ResponseEntity.status(HttpStatus.FOUND).body("Account already exist");
    }

    @GetMapping("/register/verify/{email}/{token}")
    public ResponseEntity<?> verifyAccount(@PathVariable("email") String email) {
        service.activateAccount(email);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Account Activated Successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<?> authenticate(@Valid @RequestBody AuthRequest authRequest) {
        return ResponseEntity.ok("");
    }

    @PostMapping("/reset-password")
    public ResponseEntity<?> resetPassword(@Valid @RequestBody ResetPasswordRequest request) {
        boolean isFound = service.sendResetPasswordMail(request.getEmail());
        return (isFound)? ResponseEntity.status(HttpStatus.OK).body("Reset mail request is sent, check your inbox!")
                        : ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found!");
    }

    @GetMapping("/reset-password/{email}/{token}")
    public ResponseEntity<?> showResetPasswordPage(@PathVariable String email,
                                                   @PathVariable String token) {
        String htmlContent = service.getResetPasswordForm();
        return ResponseEntity.status(HttpStatus.OK).body(htmlContent);
    }

    @PostMapping("/reset-password/save")
    public ResponseEntity<?> resetPassword(@Valid @ModelAttribute AuthRequest request) {
        service.resetPassword(request);
        return ResponseEntity.status(HttpStatus.OK).body("Password Changed Successfully!");
    }

    @PostMapping("/validate-token/{token}")
    public ResponseEntity<?> validateToken(@PathVariable("token") String token) {
        return ResponseEntity.ok("");
    }
}
