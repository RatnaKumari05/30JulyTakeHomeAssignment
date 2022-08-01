package com.npci.product.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.npci.product.entity.Product;

@RepositoryRestController(path = "/Product")
@CrossOrigin("http://localhost:4200/")
public interface ProductRepository extends JpaRepository<Product, Integer>{

}




