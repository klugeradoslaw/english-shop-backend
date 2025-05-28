package pl.klugeradoslaw.backendshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.klugeradoslaw.backendshop.entitites.CartItem;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
