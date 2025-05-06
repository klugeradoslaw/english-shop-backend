package pl.klugeradoslaw.backendshop.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.klugeradoslaw.backendshop.entitites.User;
import pl.klugeradoslaw.backendshop.repositories.UserRepository;

import java.util.List;
@RestController
@AllArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @RequestMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
