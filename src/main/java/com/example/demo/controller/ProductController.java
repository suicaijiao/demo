package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public  Product getProduct(String productId){
        Product product = productService.selectByPrimaryKey(productId);
        return product;
    }

    @GetMapping("/productList")
    public List<Product> getProductList(Product product){
        List<Product> productList = productService.getAll(product);
        return productList;
    }

    @GetMapping("/productCount")
    public int productCount(Product product){
        int count = productService.count(product);
        return count;
    }

    @DeleteMapping("/productDelete")
    public int deleteProductById(String productId){
        int row =  productService.delete(productId);
        return row;
    }

    @GetMapping("/productDeleteByIds")
    public int deleteProductByIds(String ids){
        int row = productService.deleteByIds(ids);
        return row;
    }

    @PostMapping("/saveProduct")
    public int saveProduct(Product product){
        int row = productService.save(product);
        return  row;
    }

    @PostMapping("/updateProduct")
    public int updateProduct(Product product){
        Product oldProduct = productService.selectByPrimaryKey(product.getProductId());
        int row = productService.update(product);
        return  row;
    }

}
