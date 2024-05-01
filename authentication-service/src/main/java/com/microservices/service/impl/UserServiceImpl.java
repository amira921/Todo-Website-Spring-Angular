package com.microservices.service.impl;

import com.microservices.dto.*;
import com.microservices.mapper.UserMapper;
import com.microservices.model.User;
import com.microservices.repository.UserRepository;
import com.microservices.security.*;
import com.microservices.service.*;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
@AllArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {
    private final UserRepository repository;
    private final UserMapper mapper;
    private final PasswordEncoder encoder;
    private final JwtUserDetailsService userDetailsService;
    private final JwtUtilities jwtUtilities;
    private final EmailService emailService;


    @Override
    public RegistrationRequest register(RegistrationRequest newAccount) {
        log.info("Registration Request is running...");
        RegistrationRequest account = null;
        if(!isEmailExist(newAccount.getEmail())){
            account = createAccount(newAccount);
            saveAccount(account);
            sendVerificationMail(account.getEmail());
            updateAccountIfEmailSent(account);

            log.info("Registration request accepted");
        } else log.error("Registration request failed");
        return account;
    }

    @Override
    public void verifyAccount(String email) {
        User user = repository.findByEmail(email);
        if(user != null){
            user.setAccountActive(true);
            repository.save(user);
            log.info("User Account is activated");
        }
    }


    @Override
    public String authenticate(AuthRequest request) {
        return null;
    }

    @Override
    public boolean validateToken(String token) {
        return false;
    }

    @Override
    public void sendResetPasswordMail(String email){

    }

    @Override
    public void resetPasswordIfMailSent(AuthRequest request) {

    }

    @Override
    public boolean isEmailExist(String userEmail) {
        return (userDetailsService.loadUserByUsername(userEmail) != null)? true:false;
    }

    @Override
    public RegistrationRequest createAccount(RegistrationRequest newAccount) {
        newAccount.setPassword(encoder.encode(newAccount.getPassword()));
        newAccount.setCreated_at(new Date());
        log.info("New Account prepared to save in database");
        return newAccount;
    }

    @Override
    public boolean saveAccount(RegistrationRequest newUser){
        User user = mapper.mapToEntity(newUser);
        user = repository.save(user);
        if(user != null){
            log.info("New Account saved in database");
            return true;
        }
        log.error("New Account isn't saved in database");
        return false;
    }

    @Override
    public void sendVerificationMail(String email){
        String activationToken= jwtUtilities.generateToken(email);
        emailService.sendActivationEmail(email,activationToken);
    }

    @Override
    public void updateAccountIfEmailSent(RegistrationRequest updatedAccount) {
        User user = repository.findByEmail(updatedAccount.getEmail());
        if(user != null){
            user.setActivationEmailSent(true);
            repository.save(user);
            log.info("Account updated in database");
        }
        else log.error("Account isn't updated in database");
    }
}
