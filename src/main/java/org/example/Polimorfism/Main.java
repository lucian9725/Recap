package org.example.Polimorfism;
/*
Polimorfism înseamnă: aceeași metodă poate avea comportamente diferite.
Există două tipuri:
Compile Time Polymorphism: Se realizează prin Method Overloading.
Runtime Polymorphism: Se realizează prin Method Overriding.
 */
public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Triangle();
        Shape shape3 = new Square();

        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
