package head3.quests.Quest5;

/**
 * Функциональный интерфейс — это интерфейс, который содержит ровно один абстрактный метод, то есть описание метода без тела.
 */
public class Quest5 {
    public static void main(String[] args) {

    }


    @FunctionalInterface
    interface functionalInterface {
         void abstractMethod();
       //  void abstractMethod1();
    }

    interface Interface1 extends functionalInterface {
    }

    interface Interface2 extends functionalInterface {
        @Override
         void abstractMethod();
    }

    interface Interface3 extends functionalInterface {
         default void defMethod() {
        }
    }
}

