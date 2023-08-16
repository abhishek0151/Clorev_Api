package com.core.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.entity.SubCategory;
import com.core.exception.ResourceNotFoundException;
import com.core.repo.SubCategoryRepository;
import com.core.service.SubCategoryService;
@Service
public class SubCategoryServiceImpl implements SubCategoryService {

	 @Autowired
	    private SubCategoryRepository subCategoryRepository;

	    @Override
	    public SubCategory saveSubCategory(SubCategory subCategory) {
	        return subCategoryRepository.save(subCategory);
	    }

	    @Override
	    public List<SubCategory> getAllSubCategory() {
	        return subCategoryRepository.findAll();
	    }

	    @Override
	    public SubCategory getSubCategoryById(long id) {
	        Optional<SubCategory> optional = subCategoryRepository.findById(id);
	        if (optional.isPresent()) {
	            return optional.get();
	        } else {
	            throw new ResourceNotFoundException("Category", "Id", "id");
	        }
	    }

		@Override
		public SubCategory updateSubCategory(SubCategory subCategory, long id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void deleteSubCategoryById(long id) {
			// TODO Auto-generated method stub
			
		}


}
