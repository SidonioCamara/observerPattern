package org.academiadecodigo.haltistas.second_example;


public interface Subject2 {

    void add(Observer2 observer);

    void remove(Observer2 observer);

    void notifyAllObservers();
}
