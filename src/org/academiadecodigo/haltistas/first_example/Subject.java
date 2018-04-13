package org.academiadecodigo.haltistas.first_example;


public interface Subject {

    void add(Observer observer);

    void remove(Observer observer);

    void notifyAllObservers();
}
