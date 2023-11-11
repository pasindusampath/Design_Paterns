package strategy;

public class Runner {
    public static void main(String[] args) {
        Context context = new Context(new AddOperation());
        int result = context.executeOperation(10, 5);
        System.out.println(result);

        context = new Context(new SubstractionOperation());
        result = context.executeOperation(10, 5);
        System.out.println(result);

        context = new Context(new MultiplyOperation());
        result = context.executeOperation(10, 5);
        System.out.println(result);


    }
}
