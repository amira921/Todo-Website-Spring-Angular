package com.microservices.mapper;

import com.microservices.dto.RegistrationRequest;
import com.microservices.model.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public RegistrationRequest mapToDTO(User entity) {
        if ( entity == null ) {
            return null;
        }

        RegistrationRequest.RegistrationRequestBuilder registrationRequest = RegistrationRequest.builder();

        registrationRequest.email( entity.getEmail() );
        registrationRequest.password( entity.getPassword() );
        registrationRequest.username( entity.getUsername() );
        registrationRequest.created_at( entity.getCreated_at() );

        return registrationRequest.build();
    }

    @Override
    public User mapToEntity(RegistrationRequest dto) {
        if ( dto == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.email( dto.getEmail() );
        user.password( dto.getPassword() );
        user.username( dto.getUsername() );
        user.created_at( dto.getCreated_at() );

        return user.build();
    }
}
