package com.thoughtworks.pricing;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity()
public class Price {

    public Float value;

    public String currency;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer productId;

    public Price(){

    }

    public Price(float value, String currency, int productId) {
        this.value = value;
        this.currency = currency;
        this.productId = productId;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }


}
