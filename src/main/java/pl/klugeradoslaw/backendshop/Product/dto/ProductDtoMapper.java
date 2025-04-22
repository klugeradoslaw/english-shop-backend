package pl.klugeradoslaw.backendshop.Product.dto;

import org.springframework.stereotype.Component;
import pl.klugeradoslaw.backendshop.Product.Product;
@Component
public class ProductDtoMapper {
    public ProductDto map(Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setName(product.getName());
        productDto.setDescription(product.getDescription());
        productDto.setPrice(product.getPrice());
        productDto.setItemCategory(product.getItemCategory().getName());
        productDto.setPhotoUrl(product.getPhotoUrl());
        productDto.setFileUrl(product.getFileUrl());
        productDto.setCreatedAt(product.getCreatedAt());
        return productDto;
    }
}
