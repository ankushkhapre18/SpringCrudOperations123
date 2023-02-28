package com.xadmin.SpringCrudprod.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xadmin.SpringCrudprod.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
