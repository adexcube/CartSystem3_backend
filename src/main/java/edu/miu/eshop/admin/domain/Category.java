package edu.miu.eshop.admin.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@Document
public class Category {

	
	@JsonProperty("key")
	@Id
	private Integer categoryid;
	private Integer userId;
	@JsonProperty("label")
	private String categoryname;
	private Integer parentkey;
	@JsonProperty("nodes")
	private List<Category> subcategory;
	
	
	public Category(int userid, int id, int parentkey,  String categoryname) {
		this.userId = userid;
		this.parentkey = parentkey;
		this.categoryid = id;
		this.categoryname = categoryname;
		subcategory = new ArrayList<>();
		
		
	}
	
	public Category() {
		// TODO Auto-generated constructor stub
	}
	
	public void addSubCategory(Category sub) {
		subcategory.add(sub);
	}

	public void deleteSubCategory(Category sub) {
		subcategory.remove(sub);
	}

	public String getCategoryname() {
		return categoryname;
	}


	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}


	public List<Category> getSubcategory() {
		return subcategory;
	}


	public void setSubcategory(List<Category> subcategories) {
		this.subcategory = subcategories;
	}

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getParentkey() {
		return parentkey;
	}

	public void setParentkey(Integer parentkey) {
		this.parentkey = parentkey;
	}

	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}

	
	
	
	
	
	
}
