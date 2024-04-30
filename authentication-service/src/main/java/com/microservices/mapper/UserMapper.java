package com.authentication.mapper;

import com.authentication.dto.RegistrationRequest;
import com.authentication.model.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    RegistrationRequest mapToDTO(User entity);
    User mapToEntity(RegistrationRequest dto);
}
