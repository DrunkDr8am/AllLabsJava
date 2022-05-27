package head3.quests.quest1;

public class MnojNasled implements Fly, Run {

        @Override
        public void fly() {
            System.out.println("I can Fly!!");
        }

        @Override
        public void run() {
            System.out.println("I can Run!!");
        }

    public static void main(String[] args) {
        new MnojNasled().fly();
        new MnojNasled().run();
    }
}

