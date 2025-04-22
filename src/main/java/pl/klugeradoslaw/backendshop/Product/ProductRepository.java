package pl.klugeradoslaw.backendshop.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.klugeradoslaw.backendshop.ItemCategory.ItemCategory;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository <Product, Long> {

    List<Product> findAll();
    List<Product> findByItemCategory(ItemCategory itemCategory);

}
