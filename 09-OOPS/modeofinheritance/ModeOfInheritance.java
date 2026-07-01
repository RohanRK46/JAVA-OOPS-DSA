package modeofinheritance;

class vehicles {
    public int nostyres;
    private int noswindows; 
    protected int nosshockabsorbers;

    public vehicles(int nostyres , int noswindows , int nosshockabsorbers ){
        this.nostyres = nostyres;
        this.noswindows = noswindows;
        this.nosshockabsorbers = nosshockabsorbers;
    }

    public int getnoswindows(){
        return noswindows;
    }

    public void enginStart(){
        System.out.println("Engin Started");
    }

    public void enginStop(){
        System.out.println("Engin Stop");
    }

}

// same package sub-class 
class Bus extends vehicles {

    int deccercount ;

    protected int nostyres; // public inherited as protected 
    public int noswindows; // private inherited as public 
    public int nosshockabsorbers; // protected inhertited as private

    public Bus(int nostyres , int noswindows , int nosshockabsorbers , int deccercount ){
        super(nostyres, noswindows, nosshockabsorbers);
        this.deccercount = deccercount;
    }

    public int getnostyres(){
        return nostyres;
    }
}

// same package sub-class
class Car extends vehicles {

    String suspensiontype;
    private int nostyres; // public inherited as private 
    protected int noswindows; // private inherited as protected
    private int nosshockabsorbers; // protected inherted as private


    public Car(int nostyres , int noswindows , int nosshockabsorbers , String suspensiontype){
        super(nostyres, noswindows , nosshockabsorbers);
        this.suspensiontype = suspensiontype; 
    }
}

public class ModeOfInheritance{
    public static void main(String[] args) {
        Car A = new Car(4 , 5 , 4 , "quadsuspension");
        Bus B = new Bus(6 , 12 , 8 , 2);
        
        
        System.out.println(A.noswindows); // pvt cannot be inherted as private as well
        System.out.println(A.noswindows); // pvt cannot be inhertied as protected as well
        System.out.println(A.getnoswindows()); // getter still gives the correct ans thus proving the point
        

        System.out.println(B.nostyres); // public can be inherited as protected
        System.out.println(B.getnostyres());
    }
}

// what we have find out thus far private cannot be inhertied by any mode even if we do it will create a 
// --- completely new variable with garbage value


