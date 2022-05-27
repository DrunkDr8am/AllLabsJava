package head3.quests.quest4;

/**
 * Приватные методы
 *
 * Подобные методы могут использоваться только внутри самого интерфейса, в котором они определены.
 * То есть к примеру нам надо выполнять в интерфейсе некоторые повторяющиеся действия, и в этом случае
 * такие действия можно выделить в приватные методы:
 */

public class Quest43 {
    public static void main(String[] args) {

        Calculatable c = new Calculation();
        System.out.println(c.sum(1, 2));
        System.out.println(c.sum(1, 2, 4));
    }
}
class Calculation implements Calculatable{

}
interface Calculatable{

    default int sum(int a, int b){
        return sumAll(a, b);
    }
    default int sum(int a, int b, int c){
        return sumAll(a, b, c);
    }

    private int sumAll(int... values){
        int result = 0;
        for(int n : values){
            result += n;
        }
        return result;
    }
}

