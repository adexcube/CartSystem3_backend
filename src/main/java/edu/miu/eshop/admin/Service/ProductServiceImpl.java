package edu.miu.eshop.admin.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.eshop.admin.Repository.ProductRepository;
import edu.miu.eshop.admin.domain.Product;


@Service
public class ProductServiceImpl implements ProductService {

	
	@Autowired
	private ProductRepository repository;
	



	
	
	@Override
	public List<Product> getAllProduct() {
		List<Product> product = repository.findAll();
		return product;
	}
	
	


	@Override
	public void addProduct(Product product) {
		repository.save(product);
		
	}




	@Override
	public Product getProduct(String productid) {
		Optional<Product> product = repository.findById(productid);
		return product.orElse(null);
	}




	@Override
	public List<Product> getProductsById(List<String> productid) {
		return (List<Product>) repository.findAllById(productid);
	
	}


	
}
