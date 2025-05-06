package pl.klugeradoslaw.backendshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.klugeradoslaw.backendshop.entitites.ItemCategory;
import pl.klugeradoslaw.backendshop.entitites.Product;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository <Product, Long> {

    List<Product> findAll();
    List<Product> findByItemCategory(ItemCategory itemCategory);

}
