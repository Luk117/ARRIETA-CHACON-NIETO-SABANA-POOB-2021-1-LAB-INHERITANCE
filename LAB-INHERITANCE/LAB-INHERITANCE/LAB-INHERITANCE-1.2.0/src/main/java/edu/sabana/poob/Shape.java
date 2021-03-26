package edu.sabana.poob;

public class Shape {

    public String color;

    public Shape() {

    }

    public Shape(String color) {
        this.color = color;
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("This is a %s with color %s and radius %s"
                , this.getClass().getSimpleName()
                , this.color == null ? "NONE" : this.color);

    }
}
