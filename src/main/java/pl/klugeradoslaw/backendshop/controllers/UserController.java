package pl.klugeradoslaw.backendshop.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import pl.klugeradoslaw.backendshop.dtos.RegisterUserRequest;
import pl.klugeradoslaw.backendshop.dtos.UserDto;
import pl.klugeradoslaw.backendshop.entitites.User;
import pl.klugeradoslaw.backendshop.entitites.UserRole;
import pl.klugeradoslaw.backendshop.mappers.UserMapper;
import pl.klugeradoslaw.backendshop.repositories.UserRepository;
import pl.klugeradoslaw.backendshop.services.UserService;

import java.net.URI;
import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;
    private final UserRepository userRepository;

    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody RegisterUserRequest registerUserRequest, UriComponentsBuilder uriBuilder) {
        User newUser = userMapper.toEntity(registerUserRequest);
        newUser.setUserRole(UserRole.USER);
        userRepository.save(newUser);

        UserDto userDto = userMapper.toDto(newUser);
        URI uri = uriBuilder.path("/users/{id}").buildAndExpand(userDto.getId()).toUri();
        return ResponseEntity.created(uri).body(userDto);
    }

}
