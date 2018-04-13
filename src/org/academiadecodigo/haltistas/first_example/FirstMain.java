package org.academiadecodigo.haltistas.first_example;

public class FirstMain {

    public static void main(String[] args) {

        WeatherStation station = new WeatherStation();

        Scientist neil = new Scientist("Neil", station);
        Scientist steven = new Scientist("Steven", station);

        station.add(neil);
        station.add(steven);

        station.setTemperature(23.6);
        station.setPressure(1.02);
        station.setHumidity(0.30);

    }
}
