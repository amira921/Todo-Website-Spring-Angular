package com.microservices.service;

import com.microservices.dto.*;
import org.springframework.stereotype.Service;

@Service
public interface UserService{
    // Registration Functions
    RegistrationRequest register(RegistrationRequest newAccount);
    boolean isEmailExist(String userEmail);
    RegistrationRequest createAccount(RegistrationRequest newAccount);
    boolean saveAccount(RegistrationRequest newUser);
    void sendVerificationMail(String email);
    void updateAccountIfEmailSent(RegistrationRequest updatedAccount);

    // Account Verification
    boolean verifyAccount(String email, String token);

    // Authentication Functions
    String authenticate(AuthRequest request);
    boolean validateToken(String token);

    // Reset Password Functions
    void sendResetPasswordMail(String email);
    void resetPasswordIfMailSent(AuthRequest request);
}
