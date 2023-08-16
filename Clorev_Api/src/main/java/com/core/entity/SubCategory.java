package com.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Sub_Category")
public class SubCategory {

	@Id
	@Column(name = "SubCategory_Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long subCategoryId;

	@Column(name = "SubCategory_Name")
	private String subCategoryName;

	public Long getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(Long subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public SubCategory(Long subCategoryId, String subCategoryName) {
		super();
		this.subCategoryId = subCategoryId;
		this.subCategoryName = subCategoryName;
	}

	public SubCategory() {

	}

}
