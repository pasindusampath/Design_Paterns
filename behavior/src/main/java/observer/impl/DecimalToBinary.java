package observer.impl;

import observer.Observable;

public class DecimalToBinary implements Observable {
    @Override
    public void convert(int value) {
        System.out.println(Integer.toBinaryString(value));
    }
}
