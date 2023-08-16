package com.core.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.core.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
