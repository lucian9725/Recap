package org.example.Abstractizare;

public class Abstractizare {
    public static void main(String[] args) {
        Shape circle = new Circle(4);
        Shape square = new Square(5);

        circle.display();
        square.display();
    }
}