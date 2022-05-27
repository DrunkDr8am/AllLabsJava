package head3.quests.quest2;

interface I1 {
    // это public static final int i = 0;
    int i = 0;
    default void m1() {
        System.out.println("not override");
    }

}

