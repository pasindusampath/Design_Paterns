package decorator;

import decorator.data.Circle;
import decorator.data.RedShapeDecorator;

public class Runner {
    public static void main(String[] args) {
        Circle circle = new Circle();
        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(circle);
        redShapeDecorator.drow();
        redShapeDecorator.setRed();
    }
}
