package oop1.ex;

public class Rectangle {
    int width;
    int height;

    public Rectangle() {
        this.width = 5;
        this.height = 8;
    }

    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }
}
