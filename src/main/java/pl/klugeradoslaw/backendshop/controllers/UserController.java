package pl.klugeradoslaw.backendshop.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.klugeradoslaw.backendshop.dtos.UserDto;
import pl.klugeradoslaw.backendshop.services.UserService;

import java.util.List;
@RestController
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @RequestMapping("/users")
    public ResponseEntity<List<UserDto>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }
}
