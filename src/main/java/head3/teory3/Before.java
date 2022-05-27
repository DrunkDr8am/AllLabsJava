package head3.teory3;

public class Before {

    public interface Car {

        public void gas();

        public void brake();
    }
    public class Sedan implements Car {

        @Override
        public void gas() {
            System.out.println("Газ!");
        }

        @Override
        public void brake() {
            System.out.println("Тормоз!");
        }
    }


    public class Truck implements Car {

        @Override
        public void gas() {
            System.out.println("Газ!");
        }

        @Override
        public void brake() {
            System.out.println("Тормоз!");
        }
    }


    public class F1Car implements Car {
        @Override
        public void gas() {
            System.out.println("Газ!");
        }

        @Override
        public void brake() {
            System.out.println("Тормоз!");
        }
    }
}
