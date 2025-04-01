package pl.klugeradoslaw.backendshop.Cart;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.klugeradoslaw.backendshop.CartItem.CartItem;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //@OneToOne
    //private User user;
    @OneToMany
    private Set<CartItem> items;
    private LocalDateTime createdAt;

}
