package ru.mephi.head2.Task2;

import java.util.ArrayList;
import java.util.List;


public class Task2 {

    public static void main(String[] args) {
        Circle c1 = new Circle(0, 1, 1);
        Circle c2 = new Circle(0, 3, 2);
        List<Point> arr = intersection(c1, c2);
        System.out.println(arr);
    }


    public static List<Point> intersection(Circle c1, Circle c2) {
        List<Point> arr = new ArrayList<>();

        double x1 = c1.getCenter().getX();
        double y1 = c1.getCenter().getY();
        double r1 = c1.getRadius();

        double x2 = c2.getCenter().getX();
        double y2 = c2.getCenter().getY();
        double r2 = c2.getRadius();

        if (c1.equals(c2)) {
            throw new RuntimeException("The circles match");
        }

        double distanceBetweenCenters = distanceBetweenCenters(c1, c2);


        if (ifСirclesMating(c1, c2)) {       //сопряжение
            System.out.println("Circles have one intersection");
            Point matingPoint = pointOfMating(c1, c2);
            arr.add(matingPoint);
        } else if (ifСirclesIntersect(c1, c2)) {    //пересечение
            double b = (Math.pow(r2, 2) - Math.pow(r1, 2) + Math.pow(distanceBetweenCenters, 2)) / (2 * distanceBetweenCenters);
            double a = distanceBetweenCenters - b;
            double h = Math.sqrt(Math.pow(r2, 2) - Math.pow(b, 2));
            double x = x1 + (x2 - x1) / (distanceBetweenCenters / a);
            double y = y1 + (y2 - y1) / (distanceBetweenCenters / a);
            double x3 = x - (y - y2) * h / b;
            double y3 = y + (x - x2) * h / b;
            double x4 = x + (y - y2) * h / b;
            double y4 = y - (x - x2) * h / b;
            arr.add(new Point(x3, y3));
            arr.add(new Point(x4, y4));
        } else
            System.out.println("Circles have no intersection");


        return arr;
    }


    public static double distanceBetweenCenters(Circle c1, Circle c2) {
        double x1 = c1.getCenter().getX();
        double y1 = c1.getCenter().getY();

        double x2 = c2.getCenter().getX();
        double y2 = c2.getCenter().getY();

        double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        return distance;
    }

    public static boolean ifСirclesTouchOrIntersect(Circle c1, Circle c2) {
        double r1 = c1.getRadius();

        double r2 = c2.getRadius();

        double distanceBetweenCenters = distanceBetweenCenters(c1, c2);
        if ((distanceBetweenCenters > r1 + r2) | (distanceBetweenCenters < Math.abs(r1 - r2)))
            return false;
        else
            return true;
    }

    public static boolean ifСirclesMating(Circle c1, Circle c2) {

        double r1 = c1.getRadius();

        double r2 = c2.getRadius();

        double distanceBetweenCenters = distanceBetweenCenters(c1, c2);

        if (Math.abs(distanceBetweenCenters - (r1 + r2)) == 0)
            return true;
        else
            return false;
    }

    public static Point pointOfMating(Circle c1, Circle c2) {
        if (ifСirclesMating(c1, c2)) {
            double x1 = c1.getCenter().getX();
            double y1 = c1.getCenter().getY();
            double r1 = c1.getRadius();

            double x2 = c2.getCenter().getX();
            double y2 = c2.getCenter().getY();
            double r2 = c2.getRadius();

            int n = (int) Math.abs(r1 - r2);
            double x3, y3;
            if (x1 == x2)
                x3 = x1;
            else
                x3 = (x1 + x2) / 2 - n * 0.5;
            if (y1 == y2)
                y3 = y1;
            else
                y3 = (y1 + y2) / 2 - n * 0.5;
            Point matingPoint = new Point(x3, y3);
            return matingPoint;
        } else
            throw new RuntimeException("There is no mating");
    }

    public static boolean ifСirclesIntersect(Circle c1, Circle c2) {
        if (!ifСirclesTouchOrIntersect(c1, c2))
            return false;
        if (ifСirclesMating(c1, c2))
            return false;
        return true;
    }
}