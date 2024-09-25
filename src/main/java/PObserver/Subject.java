package PObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private final List<Observer> observers = new ArrayList<>();

    /**
     * Add new observer to the subject
     * @param observer new observer to add
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * remove the observer
     * @param observer observer to delete
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * method to notify the observers
     */
    protected void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
