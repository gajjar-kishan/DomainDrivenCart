package com.fk.ddd.Cart.entities;

import java.util.List;

/**
 * Created by kishan.gajjar on 15/12/16.
 */
public class Order {

    User user;
    int amount = 0;
    List<Product> products;

    public Order(User user, List<Product> products) {
        this.user = user;
        this.products = products;
        for (Product product : products) {
            amount += product.getPrice();
        }
    }

    public User getUser() {
        return user;
    }

    public int getAmount() {
        return amount;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "user=" + user +
                ", amount=" + amount +
                ", products=" + products +
                '}';
    }
}
