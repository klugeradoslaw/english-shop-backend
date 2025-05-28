package pl.klugeradoslaw.backendshop.dtos;

import lombok.*;

@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemCategoryDto {
    private String name;
    private String description;
}
