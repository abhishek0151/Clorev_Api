package com.core.service;

import java.util.List;

import com.core.entity.Category;

public interface CategoryService {
	Category saveCategory(Category category);

	List<Category> getAllCategory();

	Category getCategoryById(long id);

	Category updateCategory(Category category, long id);

	void deleteCategoryById(long id);

}
