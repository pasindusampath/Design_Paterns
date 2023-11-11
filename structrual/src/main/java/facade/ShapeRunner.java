package facade;

import facade.custom.impl.CircleImpl;
import facade.custom.impl.RectangleImpl;
import facade.custom.impl.TriangleImpl;

import java.util.ArrayList;

public class ShapeRunner {
    public static void main(String[] args) {
        ArrayList<SuperShape> objects = new ArrayList<>();
        objects.add(new RectangleImpl());
        objects.add(new TriangleImpl());
        objects.add(new CircleImpl());

        for (SuperShape object : objects) {
            object.run();
        }

    }
}
