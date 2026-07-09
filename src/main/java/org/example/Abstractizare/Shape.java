package org.example.Abstractizare;

abstract class Shape {
    abstract double calculateArea(); //metoda abstracta fara implementare

    void display(){
        System.out.println("Aria formei este: " + calculateArea());
    }
}