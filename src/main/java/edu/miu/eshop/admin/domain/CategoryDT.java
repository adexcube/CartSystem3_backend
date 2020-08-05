package edu.miu.eshop.admin.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CategoryDT {

	
	private Integer userId;
	private Integer parentkey;
	private Category category;
	
	public CategoryDT(Integer userid, Integer parentkey, Category category) {
		this.userId = userid;
		this.category = category;
		
		
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Integer getParentkey() {
		return parentkey;
	}

	public void setParentkey(Integer parentkey) {
		this.parentkey = parentkey;
	}
	
	
	
}
