package org.example.Interfete;

public class Circle implements Shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public double calculatePeremeter(){
        return 2*Math.PI*radius;
    }
}
