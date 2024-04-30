package com.authentication.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.AddressException;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public interface EmailService {
    void sendActivationEmail(String userEmail, String activationToken) throws MessagingException;
    void updateEmailStatus(String userEmail, String emailStatus);
    @Async
    @Scheduled
    void resendFailedEmails();

    void sendResetPasswordEmail(String email, String token) throws MessagingException;
}
