package singleton;

public class Example {
    private static Example instance;

    private Example() {

    }

    public static Example getInstance() {
        return instance == null ? instance = new Example() : instance;
    }

    public void run(){
        System.out.println("He he");
    }

}
