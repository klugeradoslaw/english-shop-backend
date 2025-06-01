package pl.klugeradoslaw.backendshop.dtos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class UpdateUserRequest {
    private String email;
}
