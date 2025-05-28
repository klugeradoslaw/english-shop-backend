package pl.klugeradoslaw.backendshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.klugeradoslaw.backendshop.entitites.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
