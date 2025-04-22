package pl.klugeradoslaw.backendshop.Product;

import org.springframework.stereotype.Service;
import pl.klugeradoslaw.backendshop.Product.dto.ProductDto;
import pl.klugeradoslaw.backendshop.Product.dto.ProductDtoMapper;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductDtoMapper productDtoMapper;

    public ProductService(ProductRepository productRepository, ProductDtoMapper productDtoMapper) {
        this.productRepository = productRepository;
        this.productDtoMapper = productDtoMapper;
    }

    List<ProductDto> findAll() {
        List<Product> allProducts = productRepository.findAll();
        return allProducts.stream().map(productDtoMapper::map).toList();
    }

}
