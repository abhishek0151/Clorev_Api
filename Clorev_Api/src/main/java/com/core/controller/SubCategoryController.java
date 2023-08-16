package com.core.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.core.entity.SubCategory;
import com.core.service.CategoryService;
import com.core.service.SubCategoryService;

@RestController
public class SubCategoryController {

	private SubCategoryService subCategoryService;

	public SubCategoryController(SubCategoryService subCategoryService) {
		this.subCategoryService = subCategoryService;
	}

	@PostMapping("/api/subcategory")
	public ResponseEntity<SubCategory> saveCategory(@RequestBody SubCategory subCategory) {
		return new ResponseEntity<SubCategory>(subCategoryService.saveSubCategory(subCategory), HttpStatus.CREATED);
	}

	@GetMapping("/api/subcategory")
	public List<SubCategory> getAllSubCategory() {
		return subCategoryService.getAllSubCategory();
	}

//	@GetMapping("{id}")
//	public ResponseEntity<SubCategory> getSubcategoryById(@PathVariable("id") long SubCategoryId) {
//		return new ResponseEntity<SubCategory>(subCategoryService.getSubCategoryById(SubCategoryId), HttpStatus.OK);
//	}
//
//	@PutMapping("{id}")
//	public ResponseEntity<SubCategory> updateSubCategory(@PathVariable("id") long id,
//			@RequestBody SubCategory subCategory) {
//		return new ResponseEntity<SubCategory>(subCategoryService.updateSubCategory(subCategory, id), HttpStatus.OK);
//	}
//
//	// http://localhost:8080/api/category/1
//	@DeleteMapping("{id}")
//	public ResponseEntity<String> deleteSubCategoryById(@PathVariable("id") long id) {
//		// delete employee from DB
//		subCategoryService.deleteSubCategoryById(id);
//		return new ResponseEntity<String>("Category deleted successfully!.", HttpStatus.OK);
//	}
}
