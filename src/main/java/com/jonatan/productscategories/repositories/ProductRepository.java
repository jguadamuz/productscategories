package com.jonatan.productscategories.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jonatan.productscategories.models.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
