package com.kvinod.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kvinod.dao.CustomerDao;
import com.kvinod.entity.Customer;

@RestController
@RequestMapping("/api/customers")
public class CustomerRestController {
	
	@Autowired
	private CustomerDao dao;
	
	@GetMapping(path = "/{id}")
	public Customer getOneCustomer(@PathVariable String id) {
		return dao.findById(id).get();
	}
	
	// http://localhost/api/customers?_page=2&_limit=5
	// http://localhost/api/customers?_limit=5
	// http://localhost/api/customers?_page=12
	// http://localhost/api/customers
	@GetMapping
	public Iterable<Customer> getAllCustomers(
			@RequestParam(value = "_page", required = false, defaultValue = "1") Integer pageNum,
			@RequestParam(value = "_limit", required = false, defaultValue = "10") Integer pageSize) {
		Pageable pageable = PageRequest.of(pageNum, pageSize);
		return dao.findAll(pageable);
	}
}
