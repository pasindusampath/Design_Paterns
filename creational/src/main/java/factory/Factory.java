package factory;

import factory.ob.Circle;
import factory.ob.Rectangle;
import factory.ob.Shape;
import factory.ob.Triangle;

public class Factory {
    public enum Types{
        CIRCLE,RECTANGLE,TRIANGLE
    }
    private static Factory factory;

    private Factory(){

    }

    public static Factory getInstance(){
        return factory==null ? factory=new Factory():factory;
    }

    public Shape getShape(Types type){
        switch (type){
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            case TRIANGLE:
                return new Triangle();
            default:
                return null;
        }
    }

}
