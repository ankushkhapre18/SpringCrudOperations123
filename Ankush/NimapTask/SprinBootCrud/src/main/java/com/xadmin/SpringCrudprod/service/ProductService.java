package com.xadmin.SpringCrudprod.service;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadmin.SpringCrudprod.entity.Product;


public interface ProductService {
	// Save operation
	    Product saveProduct(Product product);
	 
	    // Read operation
	    List<Product> fetchProductList();
	 
	    // Update operation
	    Product updateProduct(Product product,
	                                Long productId);
	 
	    // Delete operation
	    void deleteProductById(Long productId);
}
