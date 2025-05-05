package pl.klugeradoslaw.backendshop.User;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
