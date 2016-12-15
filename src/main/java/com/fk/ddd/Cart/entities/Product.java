package com.fk.ddd.Cart.entities;

/**
 * Created by kishan.gajjar on 15/12/16.
 */
public class Product {
    String productId;
    Seller seller;
    String name;
    int price;

    public Product(String productId, Seller seller, String name, int price) {
        this.productId = productId;
        this.seller = seller;
        this.name = name;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public Seller getSeller() {
        return seller;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", seller=" + seller +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
