package ru.mephi.head2.Task2;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public Point setX(int x) {
        return new Point(x,this.y);
    }

    public double getY() {
        return y;
    }

    public Point setY(int y) {
        return new Point(this.x,y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}