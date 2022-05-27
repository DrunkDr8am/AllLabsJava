package head3.quests.quest2;

public class C1 implements I1 {

        @Override
        public void m1() {
            System.out.println("is override");
        }


        public static void main(String[] args) {
            new C1().m1();
        }
    }

