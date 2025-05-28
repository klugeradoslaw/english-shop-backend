package pl.klugeradoslaw.backendshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.klugeradoslaw.backendshop.entitites.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}

