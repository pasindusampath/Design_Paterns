package facade.custom.impl;

import facade.custom.Rectangle;

public class RectangleImpl implements Rectangle {
    @Override
    public void run() {
        System.out.println("Rectangle is running");
    }
}
