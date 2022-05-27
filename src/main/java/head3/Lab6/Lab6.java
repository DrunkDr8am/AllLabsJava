package head3.Lab6;

public class Lab6 {
    public static void main(String[] args) {
        DigitSequence digitSequence = new DigitSequence(1);
        digitSequence.remove();
        while (digitSequence.hasNext()){
            System.out.println(digitSequence.next());
        }
        digitSequence.forEachRemaining(Object::toString);
    }
}