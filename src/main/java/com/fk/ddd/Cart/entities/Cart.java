package com.fk.ddd.Cart.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kishan.gajjar on 15/12/16.
 */
public class Cart {

    User user;
    List<Product> cartItems = new ArrayList<Product>();

    public Cart(User user) {
        this.user = user;
    }

    public void addToCart(Product product) {
        System.out.println("Added to cart: " + product);
        cartItems.add(product);
    }

    public User getUser() {
        return user;
    }

    public List<Product> getCartItems() {
        return cartItems;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "user=" + user +
                ", cartItems=" + cartItems +
                '}';
    }
}
