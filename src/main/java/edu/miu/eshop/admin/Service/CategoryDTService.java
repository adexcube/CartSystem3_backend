package edu.miu.eshop.admin.Service;

import edu.miu.eshop.admin.domain.CategoryDT;

public interface CategoryDTService {

	public void addCategory(CategoryDT category);
	public CategoryDT getRootCategory();
}
