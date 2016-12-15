package com.fk.ddd.Cart.services;

import com.fk.ddd.Cart.entities.Cart;
import com.fk.ddd.Cart.entities.Order;

/**
 * Created by kishan.gajjar on 15/12/16.
 */
public class OrderService {

    public Order createOrder(Cart cart) {

        return new Order(cart.getUser(), cart.getCartItems());
    }
}
