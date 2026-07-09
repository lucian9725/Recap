package org.example.ClasaInterioara;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        Car.Engine engine = car.new Engine();

        engine.start();
    }
}
