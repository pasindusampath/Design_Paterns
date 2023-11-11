package decorator.data;

public class RedShapeDecorator extends ShapeDecorate{

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void drow() {
        super.drow();
        setRed();
        //System.out.println("Within Red Shape Decorator");
    }

    public void setRed(){
        System.out.println("Convert to red color");
    }

}
