package com.jonatan.productscategories.services;

import com.jonatan.productscategories.repositories.CategoryRepository;
import com.jonatan.productscategories.repositories.ProductRepository;

public class AppService {

	private CategoryRepository categoryRepository;
	private ProductRepository productRepository;
	
	public AppService(CategoryRepository cr, ProductRepository pr) {
		this.categoryRepository = cr;
		this.productRepository = pr;
	}
}
