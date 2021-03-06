package ru.mephi.head2.Lab4;

public class Lab4 {
    /**
     Почему в Java нельзя реализовать метод, меняющий местами содержимое двух
     переменных типа i n t ? Вместо этого напишите метод, меняющий местами
     содержимое двух объектов типа In t H o ld e r . (Описание этого малоизвестного
     класса можно найти в документации на прикладной программный интерфейс Java API.) Можно ли поменять местами содержимое двух объектов типа
     In t e g e r ?
     */

    //Не получится, так как создаются копии
    public static void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
    }

    //Не получится, так как создаются копии
    public static void swap(Integer a, Integer b) {
        Integer c = a;
        a = b;
        b = c;
    }

    //Получится, так как это динамические объекты и в функцию приходят не копии, а ссылки на объекты
/*    public static void swap(IntHolder a, IntHolder b) {
        int c = a.value;
        a.value = b.value;
        b.value = c;
    }*/

    public static void main(String[] args) {
        int a = -1;
        int b = 1;
        swap(a, b);
        System.out.println("a = " + a + "\nb = " + b);

        Integer a1 = -1;
        Integer b1 = 1;
        swap(a1, b1);
        System.out.println("a = " + a1 + "\nb = " + b1);

/*        IntHolder a = new IntHolder();
        IntHolder b = new IntHolder();
        a.value = -1;
        b.value = 1;
        swap(a,b);
        System.out.println("a = " + a.value + "\nb = " + b.value);*/
    }
}