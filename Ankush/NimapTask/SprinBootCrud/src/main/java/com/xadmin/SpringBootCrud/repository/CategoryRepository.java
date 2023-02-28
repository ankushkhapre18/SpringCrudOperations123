package com.xadmin.SpringBootCrud.repository;
//Importing required classes
import com.xadmin.SpringBootCrud.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository 
extends JpaRepository<Category, Long>{

}
