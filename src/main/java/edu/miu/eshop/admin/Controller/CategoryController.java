package edu.miu.eshop.admin.Controller;

 

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.miu.eshop.admin.Service.CategoryService;
import edu.miu.eshop.admin.domain.Category;
import edu.miu.eshop.admin.domain.Identity;

@RestController
@RequestMapping("category")
public class CategoryController {
	
	@Autowired
	public CategoryService service;
	
	
	@PostMapping(value = "/addcategory", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> addCategory(@RequestBody Category category) {
		service.addCategory(category);
		Category newcategory = service.getCategory(category.getCategoryid());
		return new ResponseEntity<Category>(newcategory, HttpStatus.OK);
	
	}
	
	

	@GetMapping("/getrootcategory")
	public ResponseEntity<?> getRootCategory() {
		Category category = service.getRootCategory();
		return new ResponseEntity<Category>(category, HttpStatus.OK);	
	}
			
	
	@PostMapping("/removesubcategory") 
	public ResponseEntity<?> removeSubCategory(@RequestBody Identity id) {
		Integer newid = id.getId();
			service.removeSubCategory(newid);
			return new ResponseEntity<String>("Subcategory detached successfully", HttpStatus.OK);
			
		}


//	@PostMapping("/deletecategory/{id}/{status}")
//	public ResponseEntity<?> deleteCategory(@PathVariable("id")) {
//		Category category = service.getCategory(categoryid);
//		category.setIsactive(status);
//		service.addCategory(category);
//		
//		return new ResponseEntity<String>("Category deleted successfully", HttpStatus.OK);	
//	}
	
	
	@GetMapping("/getcategory")
	public ResponseEntity<?> getCategory(@RequestBody Identity id) {
		Integer newid = id.getId();
		Category category = service.getCategory(newid);
		return new ResponseEntity<Category>(category, HttpStatus.OK);	
	}
	
	
	
	@GetMapping("/getallcategory")
	public ResponseEntity<?> getAllCategory() {
		List<Category> category = service.getAllCategory();
		return new ResponseEntity<List<Category>>(category, HttpStatus.OK);	
	}
	
}
