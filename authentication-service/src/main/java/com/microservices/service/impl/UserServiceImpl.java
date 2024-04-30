package com.authentication.service.impl;

import com.authentication.dto.*;
import com.authentication.model.User;
import com.authentication.service.*;
import jakarta.mail.MessagingException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {
    @Override
    public RegistrationRequest register(RegistrationRequest newAccount) {
        return null;
    }

    @Override
    public RegistrationRequest createAccount(RegistrationRequest newAccount) {
        return null;
    }

    @Override
    public boolean checkIfEmailExist(String userEmail) {
        return false;
    }

    @Override
    public RegistrationRequest saveNewAccount(RegistrationRequest newUser) {
        return null;
    }

    @Override
    public void sendActivationMail(String email) throws MessagingException {

    }

    @Override
    public boolean verifyAccount(String email, String token) {
        return false;
    }

    @Override
    public String authenticate(AuthRequest request) {
        return null;
    }

    @Override
    public void sendResetPassword(String email) throws MessagingException {

    }

    @Override
    public RegistrationRequest updateAccountIfEmailSent(RegistrationRequest updatedAccount) {
        return null;
    }

    @Override
    public RegistrationRequest updateAccountIfAccountVerified(User account) {
        return null;
    }

    @Override
    public void resetPassword(AuthRequest request) {

    }

    @Override
    public long getUserIdByEmail(String email) {
        return 0;
    }

    @Override
    public boolean validateToken(String token) {
        return false;
    }
}
