package ru.dataart.academy.java.figures;

public class Circle extends Figure{

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double calcPerimetr() {
        return r * 2 * Math.PI;
    }

    @Override
    public double calcArea() {
        return r * r * Math.PI;
    }
}
