package com.xadmin.SpringBootCrud.controller;
//Importing package module to this code

import com.xadmin.SpringBootCrud.entity.Category;
import com.xadmin.SpringBootCrud.service.CategoryService;
import java.util.List;
//Importing required classes
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//Annotation
@RestController

public class CategoryController {

	// Annotation
	@Autowired
	private CategoryService CategoryService;

	// Save operation
	@PostMapping("/category")
	public Category saveCategory(@RequestBody Category category) {
		return CategoryService.saveCategory(category);
	}

	// Read operation
	@GetMapping("/categories")
	public List<Category> fetchCategoryList() {
		return CategoryService.fetchCategoryList();
	}

	// Update operation
	@PutMapping("/category/{id}")
	public Category updateCategory(@RequestBody Category category, @PathVariable("id") Long categoryId) {
		return CategoryService.updateCategory(category, categoryId);
	}

	// Delete operation
	@DeleteMapping("/category/{id}")
	public String deleteCategoryById(@PathVariable("id") Long categoryId) {
		CategoryService.deleteCategoryById(categoryId);
		return "Deleted Successfully";
	}
}
