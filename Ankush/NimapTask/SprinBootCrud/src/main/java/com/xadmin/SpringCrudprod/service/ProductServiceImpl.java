package com.xadmin.SpringCrudprod.service;

import com.xadmin.SpringBootCrud.service.CategoryService;
import com.xadmin.SpringCrudprod.entity.Product;
import com.xadmin.SpringCrudprod.repository.ProductRepository;

// Importing required classes
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;

	// Save operation
	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	// Read operation
	@Override
	public List<Product> fetchProductList() {
		return (List<Product>) productRepository.findAll();
	}

	// Update operation
	@Override
	public Product updateProduct(Product product, Long productId) {
		Product prodDB = productRepository.findById(productId).get();

		if (Objects.nonNull(product.getProductName()) && !"".equalsIgnoreCase(product.getProductName())) {
			prodDB.setProductName(product.getProductName());
		}

		if (Objects.nonNull(product.getProductAddress()) && !"".equalsIgnoreCase(product.getProductAddress())) {
			prodDB.setProductAddress(product.getProductAddress());
		}

		if (Objects.nonNull(product.getProductCode()) && !"".equalsIgnoreCase(product.getProductCode())) {
			prodDB.setProductCode(product.getProductCode());
		}

		return productRepository.save(prodDB);
	}

	// Delete operation
	@Override
	public void deleteProductById(Long productId) {
		productRepository.deleteById(productId);
	}

}
