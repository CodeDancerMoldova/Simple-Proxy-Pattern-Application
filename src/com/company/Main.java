package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Videocard gtx = new Videocard();
        Product product = new ProxyProduct(gtx,200);
        product.display();
    }
}
