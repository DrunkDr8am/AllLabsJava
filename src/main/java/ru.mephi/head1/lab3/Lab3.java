package ru.mephi.head1.lab3;

import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //сканер
        System.out.print("Enter three int numbers:");
        System.out.print("\nFirst: ");
            int a = in.nextInt(); //ввод
            System.out.print("Second: ");
            int b = in.nextInt(); //ввод
            System.out.print("Third: ");
            int c = in.nextInt(); // ввод
            if (a > b) { //сравнение 3 чисел через if
                if (a > c) {
                    System.out.println("\nResult:" + "\nmax is first number: " + a);
                } else {
                    System.out.println("\nResult:" + "\nmax is third number: " + c);
                }
            } else {
                if (b > c) {
                    System.out.println("\nResult:" + "\nmax is second number: " + b);
                } else {
                    System.out.println("\nResult:" + "\nmax is third number: " + c);
                }
            }
            System.out.println("\nmath.max: " + Math.max(Math.max(a, b), c)); //сравнение цифр через функцию Math.max
    }
}