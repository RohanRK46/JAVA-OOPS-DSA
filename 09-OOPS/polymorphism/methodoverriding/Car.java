package polymorphism.methodoverriding;

    // sub class of vehicle 1 

public class Car extends Vehicles {
    String susoensionType ;

    @Override
    public void startEngin(){
        System.out.println("car's engin starting...");
    }
}   