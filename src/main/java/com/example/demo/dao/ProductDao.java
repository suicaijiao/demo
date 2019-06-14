package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.entity.Product;

public interface ProductDao {

	public int save(Product product);

	public int update(Product product);

	public int delete(@Param("productId") String productId);

	public Product selectByPrimaryKey(@Param("productId") String productId);

	public int deleteByIds(@Param("ids") String ids);

	public List<Product> getAll(Product product);

	public int count(Product product);


}
