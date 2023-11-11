package observer;

import observer.impl.DecimalToBinary;
import observer.impl.DecimalToHexaDecimal;
import observer.impl.DecimalToOctal;

public class Runner {
    public static void main(String[] args) {
        Observer observer = new Observer();
        observer.add(new DecimalToBinary());
        observer.add(new DecimalToOctal());
        observer.add(new DecimalToHexaDecimal());

        observer.send(10);

    }
}
