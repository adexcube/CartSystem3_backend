package edu.miu.eshop.admin.Service;



import java.util.List;

import edu.miu.eshop.admin.domain.Category;

public interface CategoryService {

	
	//public void addSubCategory(Category category, Category subcategory);
	public Category getCategory(int categoryid);
	public void removeSubCategory(Integer id);
	public List<Category> getAllCategory();
	public Category getRootCategory();
	public void addCategory(Category category);
	
	
}
