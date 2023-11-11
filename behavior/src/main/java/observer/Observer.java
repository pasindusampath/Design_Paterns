package observer;

import java.util.ArrayList;

public class Observer {
    private ArrayList<Observable> list = new ArrayList<>();
    public void add(Observable observable){
        list.add(observable);
    }

    public void send(int value){
        for (Observable observable : list) {
            observable.convert(value);
        }
    }

}
