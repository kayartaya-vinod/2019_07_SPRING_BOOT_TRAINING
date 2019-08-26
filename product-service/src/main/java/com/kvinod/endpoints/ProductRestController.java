package com.kvinod.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kvinod.dao.ProductDao;
import com.kvinod.entity.Product;

@RequestMapping("/api/products")
@RestController
public class ProductRestController {

	@Autowired
	private ProductDao dao;
	
	@GetMapping
	public Iterable<Product> getProducts(
			@RequestParam(value = "_page", required = false, defaultValue = "1") Integer pageNum,
			@RequestParam(value = "_limit", required = false, defaultValue = "10") Integer pageSize) {
		Pageable pageable = PageRequest.of(pageNum, pageSize);
		return dao.findAll(pageable);
	}
	
}
