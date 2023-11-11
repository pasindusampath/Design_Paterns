package observer.impl;

import observer.Observable;

public class DecimalToOctal implements Observable {
    @Override
    public void convert(int value) {
        System.out.println(Integer.toOctalString(value));
    }
}
