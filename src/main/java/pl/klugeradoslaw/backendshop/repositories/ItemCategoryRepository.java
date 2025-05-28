package pl.klugeradoslaw.backendshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.klugeradoslaw.backendshop.entitites.ItemCategory;

@Repository
public interface ItemCategoryRepository extends JpaRepository<ItemCategory, Long> {

}
