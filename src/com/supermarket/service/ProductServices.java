package com.supermarket.service;

<<<<<<< HEAD
public class ProductServices {
=======
import com.supermarket.dao.ProductDAO;
import com.supermarket.model.Product;

public class ProductServices {
    private ProductDAO productDAO;

    public ProductServices(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    //method to insert new product
    public void insertProduct(Product product){
        productDAO.insertProduct(product);
    }
>>>>>>> 3cf0032 (insert product functionality)
}
