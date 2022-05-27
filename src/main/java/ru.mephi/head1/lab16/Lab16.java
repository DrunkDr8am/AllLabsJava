package ru.mephi.head1.lab16;

public class Lab16 {

    public static void main(String[] args) {
        System.out.print(average(1));//метод с добавлением неограниченого количества переменных(находит среднее арефмитическое цифр в скобках)
    }
        public static double average ( int...arr){
            int sum = 0;
            for (int it : arr) {
                sum += it;
            }
            return (double) sum / arr.length;
        }

}
