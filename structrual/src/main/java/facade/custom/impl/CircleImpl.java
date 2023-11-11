package facade.custom.impl;

import facade.custom.Circle;

public class CircleImpl implements Circle {
    @Override
    public void run() {
        System.out.println("Circle is running");
    }
}
