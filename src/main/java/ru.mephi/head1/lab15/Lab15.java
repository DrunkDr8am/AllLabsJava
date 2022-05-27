package ru.mephi.head1.lab15;

import java.util.*;

public class Lab15 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int size = enterInt("Enter size: ");// определяем количество строк в треугольнике
        List<List<Integer>> triangle = new ArrayList<>() {{// создание массива массивов
            add(List.of(1));
        }};

        for (int i = 1; i < size; i++) { //цикл добавления строк в треугольник
            List<Integer> row = new ArrayList<>() {{
                add(1);
            }};
            for (int j = 1; j < i; j++) { // цикл добавления цифр в строку
                List<Integer> previous = triangle.get(i - 1);
                row.add(Integer.sum(previous.get(j - 1), previous.get(j)));
            }
            row.add(1);
            triangle.add(row);
        }

        print(triangle);// метод отображения полученого треугольника ( переход на строку 29)
    }

    private static void print(List<List<Integer>> triangle) {
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }

    }

    private static int enterInt(String caption) {
        System.out.print(caption);
        return sc.nextInt();
    }

}