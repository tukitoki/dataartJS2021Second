package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Figure;

public class Calculator {

    public double sumOfAreas(Figure[] figures) {
        double sum = 0;
        for (Figure fig : figures) {
            sum += fig.calcArea();
        }
        return sum;
    }
}
