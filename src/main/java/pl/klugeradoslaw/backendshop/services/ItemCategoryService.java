package pl.klugeradoslaw.backendshop.services;

import org.springframework.stereotype.Service;
import pl.klugeradoslaw.backendshop.dtos.ItemCategoryDto;
import pl.klugeradoslaw.backendshop.entitites.ItemCategory;
import pl.klugeradoslaw.backendshop.repositories.ItemCategoryRepository;

@Service
public class ItemCategoryService {

    private final ItemCategoryRepository itemCategoryRepository;

    public ItemCategoryService(ItemCategoryRepository itemCategoryRepository) {
        this.itemCategoryRepository = itemCategoryRepository;
    }

    public void addItemCategory(ItemCategoryDto itemCategoryDto) {
        ItemCategory itemCategory = new ItemCategory();
        itemCategory.setName(itemCategoryDto.getName());
        itemCategory.setDescription(itemCategoryDto.getDescription());
        itemCategoryRepository.save(itemCategory);
    }
}