package observer;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class EjemploObservable implements Observable{
    Set<Observer> observerSet = new HashSet<>();
    @Override
    public void addObserver(Observer o) {
        observerSet.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        observerSet.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerSet) {
            observer.update();
        }
    }
}
