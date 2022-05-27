package ru.mephi.head1.lab13;

import java.util.*;

public class Lab13 {
    public static void main(String[] args) {

        Random rand = new Random();
        List<Integer> numbers = new ArrayList<>();//создаем масив цифр
        for (int i = 1; i < 50; i++) { // заполняем массив цифрами от 1 до 49
            numbers.add(i);
        }
        List<Integer> BINGO = new ArrayList<>();//создаем второй массив(типо выигрывающий билет)
        for (int i = 0; i < 6; i++) {
            BINGO.add(numbers.remove(Math.abs(rand.nextInt(49 - i)))); // рандомим в этот массив переменные из первого массива попутно удаляя их из первого массива
        }
        System.out.println(BINGO);//вывод вторго массива
        System.out.println(numbers);//вывод первого массива

    }


}
