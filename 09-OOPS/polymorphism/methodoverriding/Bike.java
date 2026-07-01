package methodoverriding;

// sub class of vehicle 2 
public class Bike extends Vehicles {
    String handleType;

    @Override
    public void startEngin(){
        System.out.println("bike's engin starting...");
    }
}