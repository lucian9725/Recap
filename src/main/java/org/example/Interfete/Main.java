package org.example.Interfete;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        Shape rectangle = new Rectangle(4,5);

        System.out.println("Cerc -> Arie: " + circle.calculateArea() + ", Perimetru: " + circle.calculatePeremeter());
        System.out.println("Dreptunghi -> Arie: " + rectangle.calculateArea() + ", Perimetru: " + rectangle.calculatePeremeter());
    }
}
