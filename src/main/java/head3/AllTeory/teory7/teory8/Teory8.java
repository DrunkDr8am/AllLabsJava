package head3.AllTeory.teory7.teory8;

/**
 * мы определяем в одном месте программы лямбда-выражение и затем можем его вызывать при необходимости
 * неопределенное количество раз в различных частях программы. Отложенное выполнение может
 * потребоваться, к примеру, в следующих случаях:
 *
 * Выполнение кода отдельном потоке
 *
 * Выполнение одного и того же кода несколько раз
 *
 * Выполнение кода в результате какого-то события
 *
 * Выполнение кода только в том случае, когда он действительно необходим и если он необходим
 */

public class Teory8 {

    public static void main(String[] args) {

        Operationable operation;
        operation = (x,y)->x+y;

        int result = operation.calculate(10, 20);
        System.out.println(result);
        Operationable operation1 = (int x, int y)-> x + y;
        Operationable operation2 = (int x, int y)-> x - y;
        Operationable operation3 = (int x, int y)-> x * y;

        System.out.println(operation1.calculate(20, 10));
        System.out.println(operation2.calculate(20, 10));
        System.out.println(operation3.calculate(20, 10));
    }
}
interface Operationable{
    int calculate(int x, int y);
}
