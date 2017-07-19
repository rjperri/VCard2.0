package com.example.demo.services;

import com.example.demo.domain.Product;

/**
 *
 * @author rjperri
 */
public interface ProductService {
    
    Iterable<Product> listAllProducts();
    
    Product getProductById(Integer id);
    
    Product saveProduct(Product product);
    
    void deleteProduct(Integer id);

}
