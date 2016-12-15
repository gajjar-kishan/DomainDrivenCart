package com.fk.ddd.Cart.entities;

/**
 * Created by kishan.gajjar on 15/12/16.
 */
public class Seller {
    String sellerName;
    String sellerEmail;

    public Seller(String sellerName, String sellerEmail) {
        this.sellerName = sellerName;
        this.sellerEmail = sellerEmail;
    }

    public String getSellerName() {
        return sellerName;
    }

    public String getSellerEmail() {
        return sellerEmail;
    }
}
