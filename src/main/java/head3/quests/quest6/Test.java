package head3.quests.quest6;

import liquibase.pro.packaged.T;

import java.sql.SQLOutput;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;

        System.out.println(a.compareTo(b));
        Comparator<Integer> sortBySize = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1);
            }
        };
        System.out.println(sortBySize.compare(a,b));
    }
}



