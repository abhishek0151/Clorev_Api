package com.core.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.entity.Category;
import com.core.exception.ResourceNotFoundException;
import com.core.repo.CategoryRepository;
import com.core.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	private CategoryRepository categoryRepository;

	// create constructor using field
	public CategoryServiceImpl(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	@Override
	public Category saveCategory(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public List<Category> getAllCategory() {
		return categoryRepository.findAll();
	}

	@Override
	public Category getCategoryById(long id) {
		Optional<Category> optional = categoryRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			throw new ResourceNotFoundException("Category", "Id", "id");
		}
		// traverse through lambda function
//		return categoryRepository.findById(id).orElseThrow(() -> 
//		new categoryRepository("category", "Id", id));
	}

	// we need to check whether employee with given id is exist in DB or not
	@Override
	public Category updateCategory(Category category, long id) {
		Category existingcategory = categoryRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("category", "Id", id));
		existingcategory.setCategoryName(category.getCategoryName());

		// save existing employee to DB
		categoryRepository.save(existingcategory);
		return existingcategory;
	}

	@Override
	public void deleteCategoryById(long id) {
		Category existingcategory = categoryRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Category", "Id", id));
		categoryRepository.deleteById(id);

	}

}
