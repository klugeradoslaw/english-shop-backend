package pl.klugeradoslaw.backendshop.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.klugeradoslaw.backendshop.services.ItemCategoryService;
import pl.klugeradoslaw.backendshop.dtos.ItemCategoryDto;

@RestController
@RequestMapping("/category")
public class ItemCategoryController {

  private final ItemCategoryService itemCategoryService;

    public ItemCategoryController(ItemCategoryService itemCategoryService) {
        this.itemCategoryService = itemCategoryService;
    }

    @PostMapping
    public ResponseEntity<?> addItemCategory(@RequestBody ItemCategoryDto itemCategoryDto) {
        itemCategoryService.addItemCategory(itemCategoryDto);
        return ResponseEntity.ok("New category added to database!");
    }
}
