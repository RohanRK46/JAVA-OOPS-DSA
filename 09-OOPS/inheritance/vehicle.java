package inheritance;

public class vehicle {
    int noOfDoors ;
    int noOfTyres ;
    String fuelType ; 

    public vehicle(int noOfDoors , int noOfTyres , String fuelType ){
        this.noOfDoors = noOfDoors;
        this.noOfTyres = noOfTyres;
        this.fuelType = fuelType;
    }

    public void startengin(){
        System.out.println("Engin Starting");
    }

    public void stopengin(){
        System.out.println("Engin Stop");
    }
}
