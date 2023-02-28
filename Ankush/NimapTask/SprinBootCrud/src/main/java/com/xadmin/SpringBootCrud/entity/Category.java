package com.xadmin.SpringBootCrud.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


//Annotations
@Entity
public class Category {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long CategoryId;
    private String CategoryName;
    private String CategoryAddress;
    private String CategoryCode;
	public Long getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(Long categoryId) {
		CategoryId = categoryId;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	public String getCategoryAddress() {
		return CategoryAddress;
	}
	public void setCategoryAddress(String categoryAddress) {
		CategoryAddress = categoryAddress;
	}
	public String getCategoryCode() {
		return CategoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		CategoryCode = categoryCode;
	}
	public Category(Long categoryId, String categoryName, String categoryAddress, String categoryCode) {
		super();
		CategoryId = categoryId;
		CategoryName = categoryName;
		CategoryAddress = categoryAddress;
		CategoryCode = categoryCode;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
