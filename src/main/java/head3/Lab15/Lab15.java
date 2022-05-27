package head3.Lab15;

import head3.Lab4.IntSequence;

public class Lab15 {
    public static void main(String[] args) {
        IntSequence randomSequence = new IntSequence.RandomSequence(10, 100);
        for (int i = 0; i < 100; i++) {
            System.out.println(randomSequence.next());
        }
    }
}
