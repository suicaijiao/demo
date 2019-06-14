package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductService {

	public int save(Product product);

	public int update(Product product);

	public int delete(String productId);

	public Product selectByPrimaryKey(String productId);

	public int deleteByIds(String ids);

	public List<Product> getAll(Product product);

	public int count(Product product);


}
