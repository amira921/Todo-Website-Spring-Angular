package com.authentication.service;

import com.authentication.dto.*;
import com.authentication.model.User;
import jakarta.mail.MessagingException;
import org.springframework.stereotype.Service;

@Service
public interface UserService{
    RegistrationRequest register(RegistrationRequest newAccount);
    RegistrationRequest createAccount(RegistrationRequest newAccount);
    boolean checkIfEmailExist(String userEmail);
    RegistrationRequest saveNewAccount(RegistrationRequest newUser);
    void sendActivationMail(String email) throws MessagingException;
    boolean verifyAccount(String email, String token);
    String authenticate(AuthRequest request);
    void sendResetPassword(String email) throws MessagingException;
    RegistrationRequest updateAccountIfEmailSent(RegistrationRequest updatedAccount);
    RegistrationRequest updateAccountIfAccountVerified(User account);
    void resetPassword(AuthRequest request);
    long getUserIdByEmail(String email);
    boolean validateToken(String token);
}
