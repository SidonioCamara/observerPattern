package org.academiadecodigo.haltistas.second_example;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation2 implements Subject2 {

    private double temperature;
    private double pressure;
    private double humidity;

    private List<Observer2> observers;

    public WeatherStation2() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void add(Observer2 observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer2 observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {

        for (Observer2 observer : observers) {
            observer.update(temperature, pressure, humidity);
        }
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
        notifyAllObservers();
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyAllObservers();
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
        notifyAllObservers();
    }
}
