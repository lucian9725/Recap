package org.example.Singleton;

public class Singleton {

    private static Singleton instance;  // singura instanta

    private Singleton(){    // constructor private- nu poate fi apelat din afara

        System.out.println("Instanta a fost crata");
    }

    public static Singleton getInstance() {

        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    void showMessage() {
        System.out.println("Hello from Singleton");
    }
}
