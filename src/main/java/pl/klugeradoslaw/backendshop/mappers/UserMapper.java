package pl.klugeradoslaw.backendshop.mappers;

import org.mapstruct.Mapper;
import pl.klugeradoslaw.backendshop.dtos.UserDto;
import pl.klugeradoslaw.backendshop.entitites.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
}
