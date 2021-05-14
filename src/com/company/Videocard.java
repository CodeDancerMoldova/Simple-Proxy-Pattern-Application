package com.company;

public class Videocard implements Product{

    private int price;
    @Override
    public void display() {
        System.out.println("The price is " + price);
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
