package ru.mephi.head2.Lab16;

/**
 * 16. Реализуйте в классе Queue неограниченную очередь символьных строк. Предоставьте метод add () для ввода элемента в хвост очереди и метод remove ()
 * для удаления элемента из головы очереди. Организуйте хранение элементов
 * в виде связного списка узлов, создав вложенный класс Node. Должен ли этот
 * класс быть статическим?
 * 17. Предоставьте итератор — объект, извлекающий по порядку элементы очереди из предыдущего упражнения. Сделайте класс
 * Iterator вложенным и определите в нем методы next () и hasNext (). Определите в классе Queue метод
 * iterator (), возвращающий ссылку на объект Queue .Iterator. Должен ли внутренний класс Iterator быть статическим?
 */

public class Lab16 {
    public static void main(String[] args) {

        Queue<String> queue = new Queue<>();
        queue.add("1");
        queue.add(null);
        queue.add("3");
        queue.add("4");
        queue.add("5");
        queue.add("6");
        System.out.println(queue);

        Queue<String>.Iterator iter1 = queue.iterator();
        while (iter1.hasNext()) {
            System.out.println(iter1.next());
        }

        while (queue.size()>0){
            System.out.println(queue.remove());
        }
        System.out.println(queue);

        Queue<String>.Iterator iter2 = queue.iterator();
        while (iter2.hasNext()) {
            System.out.println(iter2.next());
            iter2.remove();
        }
        System.out.println(queue);
    }
}
