package com.springweb.services;

import com.springweb.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductServices {


    List<Product> products =new ArrayList<>(Arrays.asList(
            new Product(101, "Iphone", 50000),
            new Product(102, "Samsung", 40000),
            new Product(103, "OnePlus", 35000),
            new Product(104, "Realme", 20000),
            new Product(105, "Pixel", 60000)
    ));



    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int prodId){
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().get();
    }

    public void addProduct(Product prod){
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        int index =0;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProdId() == prod.getProdId())
                index = i;
            products.set(index,prod);
        }

    }
}
