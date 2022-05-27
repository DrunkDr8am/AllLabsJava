package ru.mephi.head1.lab11;

import java.util.Scanner;

public class Lab11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter string:");
        String str = in.nextLine(); //ввод строки
        char symbol; //присваиваем переменной символ тип чар(чтоб можно было смотреть код символа в строке)
        System.out.println("Result:");
        for (int i = 0; i < str.length(); i++) { //цикл в котором мы смотрим код каждого символа в строке и если он нужен, то выводим его
            symbol = str.charAt(i);
            int ascii = symbol;
            if ((ascii >= 0) && (ascii < 256)) {
                System.out.println("\nletter[" + (i + 1) + "]: " + "Is ASCII");
            } else {
                System.out.println("\nletter[" + (i + 1) + "]: " + ascii);
            }
        }


    }
}
