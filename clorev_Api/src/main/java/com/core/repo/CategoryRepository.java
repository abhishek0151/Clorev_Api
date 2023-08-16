package com.core.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.core.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
