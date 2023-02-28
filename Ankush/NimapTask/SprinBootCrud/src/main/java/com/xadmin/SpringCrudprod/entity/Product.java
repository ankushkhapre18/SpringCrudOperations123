package com.xadmin.SpringCrudprod.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ProductId;
    private String ProductName;
    private String ProductAddress;
    private String ProductCode;
	public Long getProductId() {
		return ProductId;
	}
	public void setProductId(Long productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getProductAddress() {
		return ProductAddress;
	}
	public void setProductAddress(String productAddress) {
		ProductAddress = productAddress;
	}
	public String getProductCode() {
		return ProductCode;
	}
	public void setProductCode(String productCode) {
		ProductCode = productCode;
	}
    
    
}
