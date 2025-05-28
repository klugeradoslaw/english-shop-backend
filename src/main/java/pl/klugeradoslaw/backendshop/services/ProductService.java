package pl.klugeradoslaw.backendshop.services;

import org.springframework.stereotype.Service;
import pl.klugeradoslaw.backendshop.dtos.ProductDto;
import pl.klugeradoslaw.backendshop.entitites.Product;
import pl.klugeradoslaw.backendshop.mappers.ProductDtoMapper;
import pl.klugeradoslaw.backendshop.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductDtoMapper productDtoMapper;

    public ProductService(ProductRepository productRepository, ProductDtoMapper productDtoMapper) {
        this.productRepository = productRepository;
        this.productDtoMapper = productDtoMapper;
    }

    public List<ProductDto> findAll() {
        List<Product> allProducts = productRepository.findAll();
        return allProducts.stream().map(productDtoMapper::map).toList();
    }

}
