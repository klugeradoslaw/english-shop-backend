package pl.klugeradoslaw.backendshop.entitites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    @JoinColumn(name = "item_category_id", referencedColumnName = "id")
    private ItemCategory itemCategory;
    private String photoUrl;
    private String fileUrl;
    private LocalDateTime createdAt;

}
