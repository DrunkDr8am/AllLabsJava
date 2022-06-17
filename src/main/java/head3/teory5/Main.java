package head3.teory5;

import java.lang.FunctionalInterface;

/**
 * это обычный метод в Java, только его особенность в том,
 * что его можно передавать в другие методы в качестве аргумента.
 */


    // функциональный интерфейс
    @FunctionalInterface
    interface MyInterface{

        // абстрактный метод
        double getPiValue();
    }
    public class Main {

        public static void main( String[] args ) {

            // объявление ссылки на MyInterface
            MyInterface ref;

            // лямбда-выражение
            ref = () -> 3.1415;

            System.out.println("Value of Pi = " + ref.getPiValue());
        }
    }

