package com.company;

public class ProxyProduct implements Product{
private Videocard videocard;
private int price;

    public ProxyProduct(Videocard videocard,int price) {
        this.videocard = videocard;
        videocard.setPrice(price);
    }

    @Override
    public void display() {
        videocard.display();
    }
}
