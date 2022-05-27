package ru.mephi.head2.Lab2;

import java.util.Random;
import java.util.Scanner;

/**
 Проанализируйте метод n e x t l n t () из класса S c a n n e r. Является ли он методом
 доступа или модифицирующим методом и почему? А что можно сказать о
 методе n e x t l n t () из класса Random ?
 */
public class Lab2 {
    public static void main(String[] args) {
        /**
         * nextInt - это одновременно и мутатор, и аксессор.
         */
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        //модифицирующий, т.к. вызывает метод setRadix();
        /**
         *   Мы говорим, что метод является мутатором, если он изменяет объект, для которого он был вызван.
         *  Является аксессором, если он оставляет объект неизменным.
         */
        Random random = new Random();
        random.nextInt();
        //метод доступа, не изменяет поля
    }
}