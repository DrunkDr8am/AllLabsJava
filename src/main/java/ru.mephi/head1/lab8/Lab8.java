package ru.mephi.head1.lab8;

import java.util.Arrays;
import java.util.Scanner;

public class Lab8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string: ");
        String a = in.nextLine(); // ввод строки
        System.out.println("Result:" +
                "\nall words    : " + Arrays.toString(a.split("\\s+")));// вывод каждого слова в строке (представляется массивом строк)

    }
}
