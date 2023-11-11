package observer.impl;

import observer.Observable;

public class DecimalToHexaDecimal implements Observable {
    @Override
    public void convert(int value) {
        System.out.println(Integer.toHexString(value));
    }
}
