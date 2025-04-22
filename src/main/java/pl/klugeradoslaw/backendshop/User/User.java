package pl.klugeradoslaw.backendshop.User;

import jakarta.persistence.*;
import pl.klugeradoslaw.backendshop.Order.Order;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private UserRole userRole; // Enum: USER, ADMIN

    @OneToMany(mappedBy = "user")
    private List<Order> orders = new ArrayList<>();

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

