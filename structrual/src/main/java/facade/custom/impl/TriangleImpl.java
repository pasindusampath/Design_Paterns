package facade.custom.impl;

import facade.custom.Triangle;

public class TriangleImpl implements Triangle {
    @Override
    public void run() {
        System.out.println("Triangle is running");
    }
}
