package com.company.homework.rectangle;

public class Rectangle {

    public int top = 0;
    public int left = 0;
    public int height = 0;
    public int width = 0;

    public Rectangle() {

    }

    public Rectangle(int top, int left, int height, int width) {
        this.top = top;
        this.left = left;
        this.height = height;
        this.width = width;
    }

    public Rectangle(int top, int left) {
        this.top = top;
        this.left = left;
    }

    public Rectangle(int height) {
        this.height = height;
        width = height;
    }

    public Rectangle(Rectangle rectangle) {
        this.width = rectangle.width;
        this.height = rectangle.height;
        this.left = rectangle.left;
        this.top = rectangle.top;
    }

    public Rectangle(int left, int height, int width) {
        this.left = left;
        this.height = height;
        this.width = height;
    }
}
