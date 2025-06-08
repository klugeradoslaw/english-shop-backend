package pl.klugeradoslaw.backendshop.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import pl.klugeradoslaw.backendshop.dtos.RegisterUserRequest;
import pl.klugeradoslaw.backendshop.dtos.UpdateUserRequest;
import pl.klugeradoslaw.backendshop.dtos.UserDto;
import pl.klugeradoslaw.backendshop.entitites.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);

    User toEntity(RegisterUserRequest registerUserRequest);

    void updateUser(UpdateUserRequest updateUserRequest, @MappingTarget User user);
}
