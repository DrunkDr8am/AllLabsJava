package ru.mephi.head1.lab9;

import java.util.Scanner;

public class Lab9 { // тут просто сравнение строк (это мой вариант. у тебя другой)
    public static void main(String[] args) {

        String str = "World";
        String str2 = "World";
        Integer i1 = 1000;
        Integer i2 = 1000;
        System.out.println(" int== "+ (i1 == i2));
        System.out.println(" == "+ (str == str2));
        System.out.print("World" == str);
        System.out.print(" ");
        System.out.print("World" == str2);
        System.out.print(" ");
        System.out.println("World".equals(str));

    }
}
