package head3.quests.quest4;


/**
 * Метод по умолчанию - это обычный метод без модификаторов, который помечается ключевым словом default.
 * Затем в классе Journal нам необязательно этот метод реализовать, хотя мы можем его и переопределить:
 */
public class Quest4 {
    class Journal implements DPrintable {

        private String name;

        String getName(){
            return name;
        }
        Journal(String name){

            this.name = name;
        }
    }
}
