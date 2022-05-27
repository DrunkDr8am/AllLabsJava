package head3.teory4;

/*
Comparable - реализуется внутри класса. По сути, определяет обычный/естественный порядок сравнения объектов.

Comparator - реализуется вне класса. Можно реализовать различные варианты сортировки, основанные на сравнении различных полей.
 */


import java.util.ArrayList;
import java.util.List;

public class teory4 {

    public static void main(String[] args){
        List<Message> messages = new ArrayList();
        messages.add(new Message("Hello, World!"));
        messages.add(new Message("Hello, Sun!"));
        System.out.println(messages);

        }
    }
