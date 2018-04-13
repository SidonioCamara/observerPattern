package org.academiadecodigo.haltistas.first_example;

public class Scientist implements Observer {

    private String name;

    private double temperature;
    private double pressure;
    private double humidity;

    private WeatherStation station;

    public Scientist(String name, WeatherStation station) {
        this.name = name;
        this.station = station;
    }

    @Override
    public void update() {
        temperature = station.getTemperature();
        pressure = station.getPressure();
        humidity = station.getHumidity();

        System.out.println(name + "\nTemperature: " + temperature + "\nPressure: " + pressure + "\nHumidity: " + humidity + "\n");
    }
}
