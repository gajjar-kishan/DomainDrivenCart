package com.fk.ddd.Cart;

import com.fk.ddd.Cart.entities.*;
import com.fk.ddd.Cart.repositories.CartRepository;
import com.fk.ddd.Cart.services.OrderService;
import com.fk.ddd.Cart.services.PaymentService;
import com.fk.ddd.Cart.valueobjects.Payment;

/**
 * Created by kishan.gajjar on 15/12/16.
 */
public class ShoppingCart {

    OrderService orderService;
    PaymentService paymentService;
    CartRepository cartRepository;

    public ShoppingCart() {
        this.orderService = new OrderService();
        this.paymentService = new PaymentService();
        this.cartRepository = new CartRepository();
    }

    public void run() {
        /** create Seller */
        Seller seller = new Seller("Kishan", "abc@xyz.com");

        /** Create Products */
        Product productOne = new Product("P1", seller, "Book", 100);
        Product productTwo = new Product("P2", seller, "Mobile", 2000);

        /** Create Users */
        User userSachin = new User("Sachin", "9123456789");

        /** Create Cart */
        Cart sachinCart = new Cart(userSachin);
        sachinCart.addToCart(productOne);

        /** place order */
        Order order = orderService.createOrder(sachinCart);
        Payment payment = paymentService.makePayment("CreditCard", order);
        System.out.println("Payment done: " + payment);

        /** repository */
        User userArun = new User("Arun", "8909770987");
        demoRepository(userArun, productTwo);
    }

    /**
     * Demo for repository responsibilities
     * */
    private void demoRepository(User user, Product product) {
        /** Create Cart */
        Cart cart = new Cart(user);
        cart.addToCart(product);

        addToRepository(cart);
        Cart fromRepository = getFromRepository(user);
        if (cart.equals(fromRepository)) {
            System.out.println("Got from repo: " + cart);
        }
    }

    private void addToRepository(Cart cart) {
        cartRepository.saveCart(cart);
    }

    private Cart getFromRepository(User user) {
        return cartRepository.getCart(user);
    }

    public static void main(String[] args) {
        new ShoppingCart().run();
    }
}
