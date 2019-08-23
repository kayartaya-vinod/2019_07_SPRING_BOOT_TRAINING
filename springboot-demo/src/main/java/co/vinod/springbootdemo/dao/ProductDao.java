package co.vinod.springbootdemo.dao;

import org.springframework.data.repository.CrudRepository;

import co.vinod.springbootdemo.entity.Product;

public interface ProductDao extends CrudRepository<Product, Integer> {
}
