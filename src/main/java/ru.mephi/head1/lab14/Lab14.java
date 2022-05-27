package ru.mephi.head1.lab14;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.IntStream;


public class Lab14 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int length = enterInt("Enter size: ");//узнаем размер матрицы
        int[][] square = new int[length][length]; //создаем матрицу(массив массивов)
        for (int i = 0; i < square.length; i++) { // в цикле заполняем матрицу (просим пользователя ввести значения)
            for (int j = 0; j < square[0].length; j++) {
                square[i][j] = enterInt(String.format("[%s,%s]: ", i, j));
            }
        }
        System.out.println("---------------------------------------");
        printMatrix(square);//вывод матрицы (переход на 54 строку)
        System.out.println(isMagicSquare(square) ? "It`s a magic square" : "It`s ordinary square"); // выполняем методна 23 строке
    }

    private static boolean isMagicSquare(int[][] square) {
        HashSet<Integer> set = new HashSet<>(); //создаем хашсет для записи в него суммы цифр в строках, колонках и диагоналях (если все цифры одинаковы то в хашсет запишется только одно число)
        //rows
        for (int[] ints : square) {//узнаем сумму в строках
            set.add(IntStream.of(ints).sum());
        }
        //columns
        for (int i = 0; i < square.length; i++) {//узнаем сумму в колонках
            int s = 0;
            for (int j = 0; j < square[0].length; j++) {
                s += square[j][i];
            }
            set.add(s);
        }
        //diagonals
        int d1 = 0;
        int d2 = 0;
        for (int i = 0; i < square.length; i++) {//узнаем сумму в диагоналях
            d1 += square[i][i];
            d2 += square[i][square.length - 1 - i];
        }
        set.add(d1);
        set.add(d2);
        return set.size() <= 1; //проверяем длинну хашсета
    }

    private static int enterInt(String caption) { //метод для ввода числс
        System.out.print(caption);
        return sc.nextInt();
    }

    private static void printMatrix(int[][] array) { // метод для вывода матрицы
        for (int[] ints : array) {
            for (int y = 0; y < ints.length; y++) {
                int day = ints[y];
                System.out.print(day == 0 ? "   " : String.format("%3d", day));
            }
            System.out.println();
        }
    }

}