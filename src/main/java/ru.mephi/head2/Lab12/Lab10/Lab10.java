package ru.mephi.head2.Lab12.Lab10;

import java.util.LinkedList;
import java.util.List;

/**
 * Предоставьте в классе R a n d o m N u m b e rs два статических метода типа ra n d o m
        E le m e n t, получающих произвольный элемент из обычного или списочного
        массива целочисленных значений. (Если обычный или списочный массив пуст,
        должен быть возвращен нуль.) Почему эти методы нельзя сделать методами
        экземпляра типа t [ ] или A r r a y L i s t < I n t e g e r > ?
*/

//Мы можем расширить ArrayList, но модифицировать его нельзя(SOLID). Да и вообще массивы не ответственны за эти задачи.
public class Lab10 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 7, 8};

        List<Integer> list = new LinkedList<>();
        for (Integer num : arr) {
            list.add(num);
        }

        System.out.println("[] = " + RandomNumbers.randomElement(arr) +
                "\nlist = " + RandomNumbers.randomElement(list));
    }
}