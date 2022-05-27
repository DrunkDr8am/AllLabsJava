package ru.mephi.head1.lab7;

import java.util.Scanner;

public class Lab7 {// не правильно
    static final short MAX = 32767;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers (0 - 65534):");
        System.out.print("\nFirst: ");
        int a = in.nextInt();
        if (a < 0) {
            throw new RuntimeException("Number < 0");
        }
        if (a > 65534) {
            throw new RuntimeException("Number > 65534");
        }
        short first = (short) (a - MAX);

        System.out.print("\nSecond: ");
        int b = in.nextInt();
        if (b < 0) {
            throw new RuntimeException("Number < 0");
        }
        if (b > 65534) {
            throw new RuntimeException("Number > 65534");
        }
        short second = (short) (b - MAX);

        System.out.println("Result:" +
                "\nfirst + second    : " + ((first + MAX) + (second + MAX)) +
                "\nfirst - second    : " + ((first + MAX) - (second + MAX)) +
                "\nfirst * second    : " + ((first + MAX) * (second + MAX)) +
                "\nfirst / second    : " + ((first + MAX) / (second + MAX)) +
                "\nfirst % second    : " + ((first + MAX) % (second + MAX)));

    }
}
