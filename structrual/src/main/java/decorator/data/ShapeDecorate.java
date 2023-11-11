package decorator.data;

public abstract class ShapeDecorate implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorate(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void drow() {
        decoratedShape.drow();
    }

}
