package pl.klugeradoslaw.backendshop.mappers;

import org.springframework.stereotype.Component;
import pl.klugeradoslaw.backendshop.entitites.Product;
import pl.klugeradoslaw.backendshop.dtos.ProductDto;

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
