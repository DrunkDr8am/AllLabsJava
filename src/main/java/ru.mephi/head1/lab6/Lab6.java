package ru.mephi.head1.lab6;

import java.math.BigInteger;
import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = in.nextInt(); // ввод инта
        BigInteger factorial; // переменная факториал теперь бигИнтеджер
        factorial = BigInteger.valueOf(1); // присвоили переменной факториал значение 1

        if (n == 0) { // проверка на ввод нуля
            factorial = BigInteger.valueOf(1);
        } else {
            for (int i = 1; i <= n; i++) { // цикл для подсчета факториала
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
        }
        System.out.println("Result:" +
                "\n!n = " + factorial);// вывод
    }
}