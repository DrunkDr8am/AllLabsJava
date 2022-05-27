package ru.mephi.head1.lab5;

public class Lab5 {
    public static void main(String[] args) {
        double maxDouble = Double.MAX_VALUE;
        int maxInt;
        maxInt = (int) maxDouble; // врисвоили инту максимальое значение типа дабл
        System.out.println("Result:" +
                "\nMaxDouble : " + maxDouble + // вывод максимального дабла
                "\nMaxInt    : " + maxInt); // вывод получившегося инта
    }
}
