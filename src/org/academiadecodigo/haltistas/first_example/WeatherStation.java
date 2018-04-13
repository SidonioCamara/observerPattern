package org.academiadecodigo.haltistas.first_example;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    private double temperature;
    private double pressure;
    private double humidity;

    private List<Observer> observers;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {

        for (Observer observer : observers) {
            observer.update();
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

    public double getTemperature() {
        return temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public double getHumidity() {
        return humidity;
    }
}
