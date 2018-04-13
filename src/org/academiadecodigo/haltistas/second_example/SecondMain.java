package org.academiadecodigo.haltistas.second_example;

public class SecondMain {

    public static void main(String[] args) {

        WeatherStation2 station = new WeatherStation2();

        Scientist2 neil = new Scientist2("Neil");
        Scientist2 steven = new Scientist2("Steven");

        station.add(neil);
        station.add(steven);

        station.setTemperature(30.1);
        station.setPressure(0.95);
        station.setHumidity(0.70);
    }
}
