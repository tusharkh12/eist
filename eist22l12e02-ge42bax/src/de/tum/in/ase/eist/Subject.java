package de.tum.in.ase.eist;

import java.util.*;

public abstract class Subject<T> {
    private List<Observer<T>> observers = new ArrayList<>();
    // TODO realize observer pattern

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }
    abstract T getUpdate();

   public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(getUpdate());

        }

    }


}
