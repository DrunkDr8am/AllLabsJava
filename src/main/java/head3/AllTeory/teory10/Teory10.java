package head3.AllTeory.teory10;

/**
 * Функциональным считается интерфейс с одним не реализованным (абстрактным) методом.
 * Под это определение попадают многие интерфейсы с “коробки”, или например, интерфейс Comparator.
 *
 * А еще — интерфейсы, которые мы создаём сами, как, например:
 */
public class Teory10 {
    @FunctionalInterface
    public interface Converter<T, N> {

        N convert(T t);

        static <T> boolean isNotNull(T t) {
            return t != null;
        }
        default void writeToConsole(T t) {
            System.out.println("Текущий объект - " + t.toString());
        }
    }
    public static void main(String[] args) {
        Dog dog = new Dog("Bobbie", 5, 3);

        Converter<Dog, Raccoon> converter = x -> new Raccoon(x.name, x.age, x.weight);

        Raccoon raccoon = converter.convert(dog);

        System.out.println("Raccoon has parameters: name - " + raccoon.name + ", age - " + raccoon.age + ", weight - " + raccoon.weight);
    }
}




//https://javarush.ru/groups/posts/2866-funkcionaljhnihe-interfeysih-v-java