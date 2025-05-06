package pl.klugeradoslaw.backendshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.klugeradoslaw.backendshop.entitites.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
