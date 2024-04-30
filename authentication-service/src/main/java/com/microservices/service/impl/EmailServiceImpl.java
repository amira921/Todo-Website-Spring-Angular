package com.authentication.service.impl;

import com.authentication.service.EmailService;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {
    @Value("${spring.mail.username}")
    private String from;

    private final JavaMailSender mailSender;

    public EmailServiceImpl(JavaMailSender mailSender){
        this.mailSender=mailSender;
    }

    @Override
    public void sendActivationEmail(String userEmail, String activationToken) throws MessagingException {

    }

    @Override
    public void updateEmailStatus(String userEmail, String emailStatus) {

    }

    @Override
    public void resendFailedEmails() {

    }

    @Override
    public void sendResetPasswordEmail(String email, String token) throws MessagingException {

    }
}
