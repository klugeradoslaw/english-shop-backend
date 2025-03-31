package pl.klugeradoslaw.backendshop.ItemCategory;

import org.springframework.stereotype.Service;
import pl.klugeradoslaw.backendshop.ItemCategory.dto.ItemCategoryDto;

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