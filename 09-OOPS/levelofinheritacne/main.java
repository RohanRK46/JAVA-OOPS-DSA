package levelofinheritacne;

class vehicle{

    public int nostyres;
    private int noswindows;
    public String fueltype;
    public Boolean E20compatible; 

    public vehicle(int nostyres , int noswindows , String fueltype , Boolean E20compatible ){
        this.nostyres = nostyres ;
        this.noswindows = noswindows ;
        this.fueltype = fueltype ;
        this.E20compatible = E20compatible;
    }

    class vehicleinfo{
            public int getnoswindows(){
                return noswindows;
            }
    }
}

class car extends vehicle {
    public car(int nostyres , int noswindows , String fueltyope, Boolean E20compatible){
        super(nostyres , noswindows , fueltyope , E20compatible);
    }
}

public class Main {
    public static void main(String[] args) {
        
        car A = new car(4, 5, "petrol",true);
        vehicle.vehicleinfo B = A.new vehicleinfo();

        System.out.println(B.getnoswindows());
    }
}
