package pl.klugeradoslaw.backendshop.Product.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="product")

public class ProductDto {

    private String name;
    private String description;
    private Double price;
    private String itemCategory;
    private String photoUrl;
    private String fileUrl;
    private LocalDateTime createdAt;

}
