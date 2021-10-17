package ru.dataart.academy.java.figures;

public class Rectangle extends Figure {

    private double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double calcPerimetr() {
        return (a + b) * 2;
    }

    @Override
    public double calcArea() {
        return a * b;
    }
}
