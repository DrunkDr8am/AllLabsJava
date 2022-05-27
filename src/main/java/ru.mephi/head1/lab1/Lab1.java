package ru.mephi.head1.lab1;

import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);  //добавление сканера "in"
        System.out.print("Enter int number:");
        int number = in.nextInt();             //ввод инт
        System.out.println("Result:" +
                "\nnumber [2]: " + Integer.toString(number, 2) + //в двоичной системе
                "\nnumber [8]: " + Integer.toString(number, 8) + //в восмеричной системе
                "\nnumber [16]: " + Integer.toString(number, 16) + // в 16-ычной системе
                "\n1/number [16]: " + Double.toHexString(1 / (double) number)); //в 16 системе деленное поделенное на 1
    }
}