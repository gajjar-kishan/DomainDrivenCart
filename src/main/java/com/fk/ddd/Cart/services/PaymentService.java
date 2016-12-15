package com.fk.ddd.Cart.services;

import com.fk.ddd.Cart.entities.Order;
import com.fk.ddd.Cart.valueobjects.Payment;

/**
 * Created by kishan.gajjar on 15/12/16.
 */
public class PaymentService {

    Payment.PaymentBuilder builder = new Payment.PaymentBuilder();

    public Payment makePayment(String paymentMethod, Order order) {
        builder.setOrder(order);
        builder.setPaymentMethod(paymentMethod);

        return builder.build();
    }
}
