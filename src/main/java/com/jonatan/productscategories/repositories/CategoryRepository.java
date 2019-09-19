package com.jonatan.productscategories.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jonatan.productscategories.models.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
