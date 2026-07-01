package methodoverriding;
public class Main {
    public static void main(String[] args) {
        Vehicles c = new Car();
        c.startEngin();;

        Vehicles a = new Bike();
        a.startEngin();
    }
}
