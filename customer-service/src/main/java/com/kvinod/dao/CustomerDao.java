package com.kvinod.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.kvinod.entity.Customer;

@Repository
public interface CustomerDao extends PagingAndSortingRepository<Customer, String> {

}
