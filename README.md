# Todo-List-Microservices
This project follows a  microservices, client-server architectures, consisting of separate services for authentication and managing to-do items, each exposing RESTful APIs.


## Application Architecture
- **discovery-service** - Eureka server
- **api-gateway** - API gateway that proxies all the micro-services
- **authentication-service** - user authentication microservice
- **task-service** - task management microservice
- **web-portal** - Single Page Application that provides the UI


# Microservices Overview
## authentication-service
### Registration
1. **Create Account**
<p align="center"><img src="asset/registration.png" width="500" length="600"></p>

2. **Verify User Email**
<p align="center"><img src="asset/account-verification.PNG" width="500" length="600"></p>

3. **Activate Account**
<p align="center"><img src="asset/account-activation.PNG" width="600" length="600"></p>

### Authentication
<p align="center"><img src="asset/login.PNG" width="500" length="600"></p>

### Change Password
1. **Send Request with Email**
<p align="center"><img src="asset/resetpassword-verifyEmail.PNG" width="500" length="600"></p>

2. **Verify User Email**
<p align="center"><img src="asset/resetpassword-emailVerification.PNG" width="500" length="600"></p>

3. **Navigate URL and Set New Password**
<p align="center"><img src="asset/changepassword.PNG" width="500" length="600"></p>

### **Authentication Service also handle Validation errors and Exceptions**
**Check a sample**
<p align="center"><img src="asset/invalidDataRequest.PNG" width="700" length="600"></p>
