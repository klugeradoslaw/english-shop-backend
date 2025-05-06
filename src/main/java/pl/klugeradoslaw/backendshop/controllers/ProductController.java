package pl.klugeradoslaw.backendshop.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.klugeradoslaw.backendshop.services.ProductService;
import pl.klugeradoslaw.backendshop.dtos.ProductDto;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<?> getProducts() {
        List<ProductDto> allProducts = productService.findAll();
        return ResponseEntity.ok(allProducts);
    }

}
