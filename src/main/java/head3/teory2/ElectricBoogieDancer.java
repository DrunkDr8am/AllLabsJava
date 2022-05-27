package head3.teory2;

/*
олиморфизм – это способность программы идентично использовать объекты
с одинаковым интерфейсом без информации о конкретном типе этого объекта.
 */

public class ElectricBoogieDancer extends Dancer {
    public ElectricBoogieDancer(String name, int age) {
        super(name, age);
    }
    // переопределение метода базового класса
    @Override
    public void dance() {
        System.out.println( toString() + "Я танцую электрик буги!");
    }
}

//программе необязательно знать какого именно типа будет объект BreakDankDancer
// или ElectricBoogieDancer. Главное, что он — потомок класса Dancer.