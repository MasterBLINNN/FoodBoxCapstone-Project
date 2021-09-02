package com.foodbox.capstoneProject;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductsService {

		@Autowired
		private ProductsRepository productRepository;
		
		
		public Iterable<Products> GetAllProducts()
		{
		   return productRepository.findAll();
		}

		public Products GetProductsById(int id)
	    {
	    	//TODO: Handle non-existent user. Currently throws an exception
	    	
	    	Optional<Products> product = productRepository.findById(id);
	    	
	    	return product.get();
	    }

	    public Products EditProduct(Products products) {
	    	
	    	//TODO: Not doing any error checking
	    	
	    	return productRepository.save(products);
	    }
		
		
		
	}