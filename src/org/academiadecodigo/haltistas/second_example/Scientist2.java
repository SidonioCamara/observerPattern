package org.academiadecodigo.haltistas.second_example;


public class Scientist2 implements Observer2 {

    private String name;

    private double temperature;
    private double pressure;
    private double humidity;

    public Scientist2(String name) {
        this.name = name;
    }

    @Override
    public void update(double temperature, double pressure, double humidity) {

        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;

        System.out.println(name + "\nTemperature: " + temperature + "\nPressure: " + pressure + "\nHumidity: " + humidity + "\n");
    }
}
