package com.company.classwork.lesson4.geometry;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();

        Shape circle = new Circle();
        circle.draw();

        Square square = new Square();
        square.draw();

        Triangle triangle = new Triangle();
        triangle.draw();

        Shape parallelepiped = new Parallelepiped();
        draw(parallelepiped);

    }

    public static void draw(Shape shape) {
        shape.draw();
    }

}
