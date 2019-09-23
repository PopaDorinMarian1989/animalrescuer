package org.fasttrackit;

import java.util.Date;

public class AnimalFood {
    private static int totalCount;
    private String name;
    private double price;
    private double amount;
    private boolean availability;
    private Date expirationDate;

    public AnimalFood() {
        totalCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public static int getTotalCount() {
        return totalCount;
    }
}
