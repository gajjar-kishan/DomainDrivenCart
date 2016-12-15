package com.fk.ddd.Cart.repositories;

import com.fk.ddd.Cart.entities.Cart;
import com.fk.ddd.Cart.entities.User;

import java.util.HashMap;

/**
 * Created by kishan.gajjar on 15/12/16.
 */
public class CartRepository {

    HashMap<User, Cart> carts = new HashMap<User, Cart>();

    public Cart getCart(User user) {
        if (carts.containsKey(user)) {
            return carts.get(user);
        }
        throw new RuntimeException("Cart not found for User: " + user.getUserName());
    }

    public void saveCart(Cart cart) {
        carts.put(cart.getUser(), cart);
    }
}
