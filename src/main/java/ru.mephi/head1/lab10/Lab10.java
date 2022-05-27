package ru.mephi.head1.lab10;

import java.util.Scanner;
import java.util.Random;

import static java.lang.Long.MAX_VALUE;

public class Lab10 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Random rand = new Random();
        System.out.print("Enter length:");
        int length = setInt();
        StringBuilder sb = new StringBuilder();
        System.out.println();
        if (length>13){
            do {
             //   sb.append(Long.toUnsignedString(rand.nextLong(getPow((length - 1)), (MAX_VALUE)), 36));
                System.out.print(Long.toUnsignedString(rand.nextLong(getPow((length - 1)), (MAX_VALUE)), 36));
                length=length-13;
            }while(length>13);
        }
        if (length == 1) {
           // sb.append(Long.toUnsignedString(rand.nextLong(0, (getPow(length))), 36));
            System.out.print(Long.toUnsignedString(rand.nextLong(0, (getPow(length))), 36));
        } else {
            if (length > 1 && length < 12) {
               // sb.append(Long.toUnsignedString(rand.nextLong(getPow((length - 1)), (getPow(length))), 36));
                System.out.print(Long.toUnsignedString(rand.nextLong(getPow((length - 1)), (getPow(length))), 36));
            } else {
                if (length == 13) {
                   // sb.append(Long.toUnsignedString(rand.nextLong(getPow((length - 1)), (MAX_VALUE)), 36));
                    System.out.print(Long.toUnsignedString(rand.nextLong(getPow((length - 1)), (MAX_VALUE)), 36));
                }
            }
        }
        //String result = sb.toString();
        //System.out.println(result);
    }

    public static long getPow(int number) {
        long l = 36;
        for (int i = 1; i < number; i++) {
            l = l * 36;
        }
        return l;
    }

    public static int setInt() {

        return in.nextInt();
    }


}

//1) функциональная декомпозиция
//2)возвращать строку заданной длины
//bigDecinal from to plus multuply