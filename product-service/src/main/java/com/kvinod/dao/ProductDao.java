package com.kvinod.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.kvinod.entity.Product;

public interface ProductDao extends PagingAndSortingRepository<Product, Integer> {

}
