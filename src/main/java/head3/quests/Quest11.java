package head3.quests;

/**
 * Любая переменная, определенная в интерфейсе, автоматически объявляется как
 * p u b l i c s t a t i c f i n a l ,
 */
public class Quest11 {
    public static void main(String[] args) {
         final int a =1;
        System.out.println(SwingConstants.NORTH+SwingConstants.N0RTH_EAST+SwingConstants.EAST);
    }
    public interface SwingConstants {
        int NORTH = 1;
        int N0RTH_EAST = 2;
        int EAST = 3;
        //int WEST = a;

    }

}
