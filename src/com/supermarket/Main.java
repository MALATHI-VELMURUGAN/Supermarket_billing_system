package com.supermarket;

import com.supermarket.dao.ProductDAO;
import com.supermarket.dao.ProductDAOImpl;
import com.supermarket.model.Product;
import com.supermarket.service.ProductServices;
import com.supermarket.utility.DatabaseConnection;

public class Main {

    public static void main(String[] args) {

        // Instantiate necessary objects
        DatabaseConnection databaseConnection = new DatabaseConnection();
        ProductDAO productDAO = new ProductDAOImpl(databaseConnection);
        ProductServices productServices = new ProductServices(productDAO);

        Product clinicPlus = new Product("clinic plus", "bath", 2.00, 5);
        productServices.insertProduct(clinicPlus);
    }
}
