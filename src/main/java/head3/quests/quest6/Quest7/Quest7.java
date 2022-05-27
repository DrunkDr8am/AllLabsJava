package head3.quests.quest6.Quest7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Лямбда-выражение — это блок кода, который передается для последующего выполнения один или несколько раз.
 * В предыдущих разделах рассматривались случаи, когда такой блок кода оказался бы очень кстати, в том числе для:
 * • передачи метода сравнения методу A r r a y s . s o r t ( ) ;
 * • выполнения задачи в отдельном потоке;
 * • указания действия, которое должно быть выполнено после щелчка на экранной кнопке
 */
public class Quest7 {
    public static void main(String[] args) {
        String[] array1 = {"мама", "мыла", "раму"};
        String[] array2 = {"я", "очень", "люблю", "java"};
        String[] array3 = {"мир", "труд", "май"};

        List<String[]> arrays = new ArrayList<>();
        arrays.add(array1);
        arrays.add(array2);
        arrays.add(array3);

        arrays.sort((o1, o2) -> o1.length - o2.length);


        System.out.println("");


    }
}
