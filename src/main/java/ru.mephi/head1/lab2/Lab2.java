package ru.mephi.head1.lab2;

import java.util.Scanner;

import static java.lang.Math.floorMod;

public class Lab2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //добавление сканера
        System.out.print("Enter int number:");
        int number = in.nextInt(); // ввод числа

        System.out.print("Result:" + "\n%: " + ((number % 360 + 360) % 360)); //формула для остатка от деления
        System.out.print("\nfloorMod(): " + floorMod(number, 360)); //используем вместо деления функцию floorMod
    }
}
