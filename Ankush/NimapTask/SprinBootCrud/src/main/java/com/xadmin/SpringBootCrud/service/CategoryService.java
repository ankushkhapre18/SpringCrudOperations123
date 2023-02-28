package com.xadmin.SpringBootCrud.service;

import com.xadmin.SpringBootCrud.entity.Category;

//Importing required classes
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface CategoryService {

	// Save operation
	Category saveCategory(Category category);

	// Read operation
	List<Category> fetchCategoryList();

	// Update operation
	Category updateCategory(Category category, Long categoryId);

	// Delete operation
	void deleteCategoryById(Long categoryId);
}
