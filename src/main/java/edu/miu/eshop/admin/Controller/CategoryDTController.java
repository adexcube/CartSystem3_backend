package edu.miu.eshop.admin.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import edu.miu.eshop.admin.Service.CategoryDTService;
import edu.miu.eshop.admin.domain.Category;
import edu.miu.eshop.admin.domain.CategoryDT;

public class CategoryDTController {

	
	@Autowired
	public CategoryDTService dtservice;
	
	@PostMapping(value = "/addcategory", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> addCategory(@RequestBody CategoryDT dtcategory) {
		dtservice.addCategory(dtcategory);
		Category category = dtcategory.getCategory();
		return new ResponseEntity<Category>(category, HttpStatus.OK);
	
	}
	
}
