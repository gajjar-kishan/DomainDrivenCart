package com.fk.ddd.Cart.valueobjects;

import com.fk.ddd.Cart.entities.Order;
import com.fk.ddd.Cart.entities.Product;
import com.fk.ddd.Cart.entities.User;

import java.util.List;

/**
 * Created by kishan.gajjar on 15/12/16.
 */
public class Payment {
    String paymentMethod;
    User user;
    int amount;
    List<Product> products;

    public Payment(String paymentMethod, User user, int amount, List<Product> products) {
        this.paymentMethod = paymentMethod;
        this.user = user;
        this.amount = amount;
        this.products = products;
    }

    public static class PaymentBuilder {
        Order order;
        String paymentMethod;

        public void setOrder(Order order) {
            this.order = order;
        }

        public void setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
        }

        public Payment build() {
            return new Payment(paymentMethod, order.getUser(), order.getAmount(), order.getProducts());
        }
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentMethod='" + paymentMethod + '\'' +
                ", user=" + user +
                ", amount=" + amount +
                ", products=" + products +
                '}';
    }
}
