package polymorphism.methodoverriding;

import inheritance.vehicle;

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        startenginall(c);

        Vehicles a = new Bike();
        a.startEngin();
    }
    
    public static void startenginall(Vehicles a){
        a.startEngin();
    }
}
