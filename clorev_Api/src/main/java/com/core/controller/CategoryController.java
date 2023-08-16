package com.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.core.entity.Category;
import com.core.service.CategoryService;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

	private CategoryService CategoryService;

	public CategoryController(CategoryService CategoryService) {
		this.CategoryService = CategoryService;
	}

	// build create Category REST API
	
	//http://localhost:8080/api/category
	@PostMapping()
	public ResponseEntity<Category> saveCategory(@RequestBody Category Category) {
		return new ResponseEntity<Category>(CategoryService.saveCategory(Category), HttpStatus.CREATED);
	}
	
	//http://localhost:8080/api/category
	@GetMapping()
	public List<Category> getAllCategory() {
		return CategoryService.getAllCategory();
	}

	// build get employee by id REST API
	//http://localhost:8080/api/category/1
	@GetMapping("{id}")
	public ResponseEntity<Category> getCategoryById(@PathVariable("id") long CategoryId) {
		return new ResponseEntity<Category>(CategoryService.getCategoryById(CategoryId), HttpStatus.OK);
	}

	// build update employee REST API
	//http://localhost:8080/api/category/1
	@PutMapping("{id}")
	public ResponseEntity<Category> updateCategory(@PathVariable("id") long id, @RequestBody Category Category) {
		return new ResponseEntity<Category>(CategoryService.updateCategory(Category, id), HttpStatus.OK);
	}

	//http://localhost:8080/api/category/1
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteCategoryById(@PathVariable("id") long id) {
		// delete employee from DB
		CategoryService.deleteCategoryById(id);
		return new ResponseEntity<String>("Category deleted successfully!.", HttpStatus.OK);
	}
}
