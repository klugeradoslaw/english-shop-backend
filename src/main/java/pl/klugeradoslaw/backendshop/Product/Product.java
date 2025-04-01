package pl.klugeradoslaw.backendshop.Product;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.klugeradoslaw.backendshop.ItemCategory.ItemCategory;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="product")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    @ManyToOne
    private ItemCategory itemCategory;
    private String photoUrl;
    private String fileUrl;
    private LocalDateTime createdAt;

}
