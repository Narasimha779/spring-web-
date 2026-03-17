package com.springweb.controller;

import com.springweb.model.Product;
import com.springweb.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {

    @Autowired
    ProductServices services;

@GetMapping("/products")
 public List<Product> getProduct(){
     return services.getProducts();
 }


   @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId) {
        return services.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){

        services.addProduct(prod);
    }
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
      services.updateProduct(prod);

    }

    @DeleteMapping("/Products/{prodId}")
    public  void deleteProduct(@RequestBody int prodId){
        services.deleteProduct(prodId);
    }
}
