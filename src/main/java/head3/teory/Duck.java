package head3.teory;

/*
Интерфейс — это механизм, подробно выписывающий контракт между двумя сторонами:
поставщиком службы и классами, объекты которых требуется использовать
в этой службе.
*/


public class Duck implements Swimmable {


    public void eat(){
        System.out.println("Уточка, кушай!");
    }

    public void run(){
        System.out.println("Уточка, беги!");
    }

    public static void main(String[] args) {

        Duck duck = new Duck();
        duck.swim();
        duck.eat();
        duck.run();

    }
}
