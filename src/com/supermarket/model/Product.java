package com.supermarket.model;

public class Product {
    private int id;
<<<<<<< HEAD
    private String name;
    private String category;
    private double price;
=======
    private String product_name;
    private double price;
    private String category;
    private int quantity;


    public Product(String name, String category, double price, int quantity) {
        this.product_name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }
>>>>>>> 3cf0032 (insert product functionality)

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
<<<<<<< HEAD
        return name;
    }

    public void setName(String name) {
        this.name = name;
=======
        return product_name;
    }

    public void setName(String name) {
        this.product_name = name;
>>>>>>> 3cf0032 (insert product functionality)
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

<<<<<<< HEAD
=======
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

>>>>>>> 3cf0032 (insert product functionality)
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
<<<<<<< HEAD
=======

    @Override
    public String toString() {
        return "Product{" +
                ", name='" + product_name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
>>>>>>> 3cf0032 (insert product functionality)
}
