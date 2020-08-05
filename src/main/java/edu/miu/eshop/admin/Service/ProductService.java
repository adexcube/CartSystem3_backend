package edu.miu.eshop.admin.Service;

import java.util.List;

import edu.miu.eshop.admin.domain.Product;

public interface ProductService {

	public void addProduct(Product product);
	public Product getProduct(String productid);
	public List<Product> getAllProduct();
	public List<Product> getProductsById(List<String> productid);
	
}
