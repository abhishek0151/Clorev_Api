package com.core.service;

import java.util.List;

import com.core.entity.SubCategory;

public interface SubCategoryService {

	SubCategory saveSubCategory(SubCategory subCategory);

	List<SubCategory> getAllSubCategory();

	SubCategory getSubCategoryById(long id);

	SubCategory updateSubCategory(SubCategory subCategory, long id);

	void deleteSubCategoryById(long id);
}
