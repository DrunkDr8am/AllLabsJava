package ru.mephi.head2.Lab12.Lab10;

import java.util.List;
import java.util.Random;

public class RandomNumbers {
    static final Random random = new Random();

    public static int randomElement(List<Integer> arr) {
        if (arr.size() > 0) {
           int a=random.nextInt(arr.size());
            return arr.get(a);
        }
        return 0;
    }

    public static int randomElement(int[] arr) {
        if (arr.length > 0)
            return arr[random.nextInt(Integer.MAX_VALUE) % arr.length];
        return 0;
    }
}