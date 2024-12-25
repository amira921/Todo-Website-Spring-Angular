package com.microservices.apiGatway.dto;

import lombok.*;
import java.util.Date;

@Data
@Setter
@Getter
@Builder
public class AuthModel {
    private String email;
    private String password;
    private String username;
    private Date created_at;
    private boolean isActivationEmailSent;
    private boolean isAccountActive;
}
