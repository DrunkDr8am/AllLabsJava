package ru.mephi.head1.lab4;

public class Lab4 {

    public static void main(String[] args) {

        double zero = 0;
        double max = Double.MAX_VALUE; // максимально возможное значение типа дабл
        double min = Double.MIN_VALUE; // минимально возможное значение типа дабл
        System.out.println("Result:" +
                "\nMax         : " + max + // вывод макс
                "\nMin         : " + min + // вывод мин
                "\nMax.nextUp  : " + Math.nextUp(max) + // вывод макс через Math.nextUp
                "\nMin.nextUp  : " + Math.nextUp(zero)); // вывод min через Math.nextUp
    }
}