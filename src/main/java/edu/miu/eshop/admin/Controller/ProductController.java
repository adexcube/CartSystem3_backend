package edu.miu.eshop.admin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.miu.eshop.admin.Service.ProductService;
import edu.miu.eshop.admin.domain.Product;


@RestController
@RequestMapping("product")
public class ProductController {

	
	@Autowired
	private ProductService service;

	
	
	@GetMapping(value="/product/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getProduct(@PathVariable("id") String productid) {
		Product product = service.getProduct(productid);
		return new ResponseEntity<Product>(product, HttpStatus.OK);
		
	}
	
	@GetMapping(value="/allproduct", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllProduct(){
		List<Product> product = service.getAllProduct();
		return new ResponseEntity<List<Product>>(product, HttpStatus.OK);
		
	}
	
//	@PostMapping(value="/add/{productid}/{productname}/{price}/{brand}/{quantity}")
//	public ResponseEntity<?> addProduct(@PathVariable("productid") long productid, @PathVariable("productname")
//	String productname, @PathVariable("price") double price, @PathVariable("brand") String brand, @PathVariable("quantity") int quantity) {
//		Product product = new Product(productid, productname, price, brand, quantity);
//		service.addProduct(product);
//		return new ResponseEntity<String>("Product added successfully", HttpStatus.OK);
//		
//	}
	
	
	@PostMapping(value="/{productid}/{isactive}")
	public ResponseEntity<?> changeActiveStatus(@PathVariable("productid") String productid, @PathVariable("isactive") boolean isactive){
		Product product = service.getProduct(productid);
		product.setActive(isactive);
		service.addProduct(product);
		return new ResponseEntity<String>("Status changed successfully", HttpStatus.OK);
	}
	
	
	@GetMapping(value="/productsbyids")
	public ResponseEntity<?> getProductsByIds(@RequestParam("ids") List<String> ids) {
		List<Product> product = service.getProductsById(ids);
		return new ResponseEntity<List<Product>>(product, HttpStatus.OK);
	}
	
	
	
}
