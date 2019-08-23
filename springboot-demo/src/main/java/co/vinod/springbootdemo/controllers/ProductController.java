package co.vinod.springbootdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.vinod.springbootdemo.dao.ProductDao;
import co.vinod.springbootdemo.entity.Product;

@CrossOrigin
@RequestMapping("/api/products")
@RestController
public class ProductController {
	
	@Autowired
	ProductDao dao;

	
	@GetMapping("/{id}")
	public Product getOneProduct(@PathVariable Integer id) {
		return dao.findById(id).get();
	}
	
	@GetMapping
	public Iterable<Product> getAllProducts() {
		return dao.findAll();
	}
}
