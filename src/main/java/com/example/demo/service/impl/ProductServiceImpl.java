package com.example.demo.service.impl;

import com.example.demo.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
@Service("productService")
public class ProductServiceImpl implements ProductService  {

	@Autowired
	private ProductDao productDao;

	@Override
	public int save(Product product) {
		return productDao.save(product);
	}

	@Override
	public int update(Product product) {
		return productDao.update(product);
	}

	@Override
	public int delete(String productId) {
		return productDao.delete(productId);
	}

	@Override
	public int deleteByIds(String ids) {
		return productDao.deleteByIds(ids);
	}

	@Override
	public Product selectByPrimaryKey(String productId) {
		return productDao.selectByPrimaryKey(productId);
	}

	@Override
	public List<Product> getAll(Product product) {
		return productDao.getAll(product);
	}

	@Override
	public int count(Product product) {
		return productDao.count(product);
	}

}
