package head3.Lab14;

import head3.Lab1.Employee;
import head3.Lab1.Lab1;

import java.util.Arrays;
import java.util.Comparator;

public class Lab14 {
    public static void main(String[] args) {

        Arrays.sort(Lab1.createRandomListEmployees(), Comparator.comparing(Employee::getMeasure).thenComparing(Employee::getName));

        Arrays.sort(Lab1.createRandomListEmployees(), (o1, o2) -> {
            int res = (int) (o1.getMeasure() - o2.getMeasure());
            if (res == 0) {
                return o1.getName().compareTo(o2.getName());
            }
            return res;
        });

        Arrays.sort(Lab1.createRandomListEmployees(), (o1, o2)-> (int) (o1.getMeasure() - o2.getMeasure())!=0?(int) (o1.getMeasure() - o2.getMeasure()):o1.getName().compareTo(o2.getName()));
    }
}
