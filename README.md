# Todo-List-Microservices
This project follows a  microservices, client-server architectures, consisting of separate services for authentication and managing to-do items, each exposing RESTful APIs.


## Application Architecture
- **discovery-service** - Eureka server
- **api-gateway** - API gateway that proxies all the micro-services
- **authentication-service** - user authentication microservice
- **task-service** - task management microservice
- **web-portal** - client Application that provides the UI

## Microservices Overview
## Authentication Service

**1. Registration Process**
   - User provides email, password, and username.
   - Verification email is sent to the provided email address.
   - User is required to navigate to the verification link included in the email to activate the account.
   - Without activating the account through the provided link, the user cannot log in.

**2. Authentication Process**
- User provides email and password.
- If the account is not found, the user cannot access the app and needs to register.
- If the account is found but not active, the user cannot access the app and needs to check the inbox for activation instructions.
- If the account is found, active, and the password is incorrect, the user cannot access the app and needs to try again or reset the password.
- If the account is found, active, and the password is correct, the user can access the app.

**3. Reset Password Process**
- User provides their email address.
- If the account is not found, the user cannot access the app and is prompted to register.
- If the account is found, a password reset email is sent to the provided email address.
- User receives an email with link to reset their password.
- User clicks on the reset password link provided in the email.
- User is directed to a page where they can enter their email address and set a new password.
- After submitting the new password, the user's password is updated.
- User can now log in using the new password.

## Demo


## Swagger EndPoints

### web Portal

### Authentication Micro-Service

### Task Micro-Service


## Postman Testing

### Registration Process
**1. Registration: invalid data**
<p align="center"><img src="asset/invalidDataRequest.PNG" width="600" length="600"></p>

**2. Registration: valid data**
<p align="center"><img src="asset/registration.PNG" width="600" length="600"></p>

**3. Registration: user exists**
<p align="center"><img src="asset/registration_userExists.PNG" width="600" length="600"></p>

**4. Registration: verification email to activate account**
<p align="center"><img src="asset/account-verification.PNG" width="600" length="600"></p>

**5. Registration: account activation**
<p align="center"><img src="asset/activation.PNG" width="600" length="600"></p>


### Reset Password Process
**1. reset password: user is not found**
<p align="center"><img src="asset/reset-not-found.PNG" width="600" length="600"></p>

**2. reset password: user is found**
<p align="center"><img src="asset/rerset-found.PNG" width="600" length="600"></p>

**3. reset password: verify email**
<p align="center"><img src="asset/reset-verification.PNG" width="600" length="600"></p>

**4. reset password: send new password**
<p align="center">
<img src="asset/reset-send-new-password.PNG" width="300" length="600">
<img src="asset/reset-password-changed.PNG" width="300" length="600"></p>
