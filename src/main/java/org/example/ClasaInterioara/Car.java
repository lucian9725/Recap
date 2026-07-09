package org.example.ClasaInterioara;

public class Car {

    private String model = "Tesla";

    class Engine {
        void start() {
            System.out.println("Motorul porneste pentru " + model);
        }
    }
}
