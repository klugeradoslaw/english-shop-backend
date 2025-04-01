package pl.klugeradoslaw.backendshop.OrderItem;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.klugeradoslaw.backendshop.Order.Order;
import pl.klugeradoslaw.backendshop.Product.Product;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Order order;
    @ManyToOne
    private Product product;
    private double price;
    private LocalDateTime addedDate;
}
