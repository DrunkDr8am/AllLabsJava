package head3.AllTeory.teory3;

public class Now {
    public interface Car {

        public default void gas() {
            System.out.println("Газ!");
        }

        public default void brake() {
            System.out.println("Тормоз!");
        }
    }

    public class Sedan implements Car {

    }

    public class Truck implements Car {

    }

    public class F1Car implements Car {

    }

}
