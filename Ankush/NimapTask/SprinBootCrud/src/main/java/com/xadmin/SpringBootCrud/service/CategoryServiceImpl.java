package com.xadmin.SpringBootCrud.service;

import com.xadmin.SpringBootCrud.entity.Category;
import com.xadmin.SpringBootCrud.repository.CategoryRepository;
// Importing required classes
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Annotation
@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryRepository CategoryRepository;

	// Save operation
	@Override
	public Category saveCategory(Category category) {
		return CategoryRepository.save(category);
	}

	// Read operation
	@Override
	public List<Category> fetchCategoryList() {
		return (List<Category>) CategoryRepository.findAll();
	}

	// Update operation
	@Override
	public Category updateCategory(Category category, Long categoryId) {
		Category catDB = CategoryRepository.findById(categoryId).get();

		if (Objects.nonNull(category.getCategoryName()) && !"".equalsIgnoreCase(category.getCategoryName())) {
			catDB.setCategoryName(category.getCategoryName());
		}

		if (Objects.nonNull(category.getCategoryAddress()) && !"".equalsIgnoreCase(category.getCategoryCode())) {
			catDB.setCategoryAddress(category.getCategoryCode());
		}

		if (Objects.nonNull(category.getCategoryCode()) && !"".equalsIgnoreCase(category.getCategoryCode())) {
			catDB.setCategoryCode(category.getCategoryCode());
		}

		return CategoryRepository.save(catDB);
	}

	// Delete operation
	@Override
	public void deleteCategoryById(Long categoryId) {
		CategoryRepository.deleteById(categoryId);
	}
}
