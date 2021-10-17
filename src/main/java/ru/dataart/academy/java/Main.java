package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Circle;
import ru.dataart.academy.java.figures.Figure;
import ru.dataart.academy.java.figures.Rectangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task for Java OOP");

        Figure rect1 = new Rectangle(4, 5);
        Figure circ1 = new Circle(6);
        Figure rect2 = new Rectangle(8, 7);
        Figure circ2 = new Circle(7);
        Figure rect3 = new Rectangle(11, 2);
        Figure circ3 = new Circle(2);
        Figure rect4 = new Rectangle(13, 4);
        Figure circ4 = new Circle(9);
        Figure[] arr = new Figure[]{rect1, circ1, rect2, circ2, rect3, circ3, rect4, circ4};
        Calculator calc = new Calculator();
        System.out.println(calc.sumOfAreas(arr));
    }
}