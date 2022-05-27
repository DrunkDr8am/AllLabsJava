package ru.mephi.head2.Task2;

public class Circle {
    private Point center;
    private double radius;

    public Circle(double radius) {
        this.center=new Point(0, 0);
        this.radius = radius;
    }

    public Circle(double x, double y, double radius) {
        this.center=new Point(x, y);
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
