package edu.miu.eshop.admin.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.eshop.admin.Repository.CategoryRepository;
import edu.miu.eshop.admin.domain.Category;

@Service
public class CategoryServiceImpl implements CategoryService {

	
	@Autowired
	private CategoryRepository repository;


	@Override
	public Category getCategory(int categoryid) {
		Optional<Category> category = repository.findById(categoryid);
		return category.orElse(null);
		
	}
	
	
	
	
	@Override
	public List<Category> getAllCategory() {
		List<Category> category = repository.findAll();
		return category;
		
	}
	
//	@Override
//	public void addSubCategory(Category category, Category subcategory) {
//		category.addSubCategory(subcategory);
//		addCategory(category);
//
//	}
	
	
	
	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void removeSubCategory(Integer id) {
		Optional <Category> category = repository.findById(id);
		Category newcategory = category.orElse(null);
		Integer parentkey = newcategory.getParentkey();
		Optional<Category> cat = repository.findById(parentkey);
		newcategory.getSubcategory().remove(cat);
	

	}	
			
	
	@Override
	public Category getRootCategory() {
	// TODO Auto-generated method stub
		Optional<Category> root = repository.findById(1);
		return root.orElse(null);
}

	@Override
	public void addCategory(Category category) {
		repository.save(category);
	}


	

}
