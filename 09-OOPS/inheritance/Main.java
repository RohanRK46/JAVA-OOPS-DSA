package inheritance;

import java.util.*;

class Vehicle {
    public int nosWindows;
    public int nosTyres;
    public String Brand;

    public Vehicle(int nosWindows, int nosTyres, String Brand) {
        this.nosWindows = nosWindows;
        this.nosTyres = nosTyres;
        this.Brand = Brand;
    }

    public String getVehicleDetail() {
        return "Car { Company Name : " + Brand + " No Of Tyres : " + nosTyres + " No Of Windows : " + nosWindows + " }";
    }
}

class Car extends Vehicle {
    public String SuspensionType;

    public String getCarDetail() {
        return "Car { Company Name : " + Brand + ", No Of Tyres : " + nosTyres + ", No Of Windows : " + nosWindows + ", Suspension Type : " + SuspensionType + " }";
    }

    public Car(int nosWindows, int nosTyres, String Brand, String SuspensionType) {
        super(nosWindows, nosTyres, Brand);
        this.SuspensionType = SuspensionType;
    }
}

public class Main {
    public static void main(String[] args) {
        Car A = new Car(5, 4, "Alto", "Quad Suspension");
        Car B = new Car(8, 4, "BMW M5", "Octa Suspesnion");

        System.out.println(A.getCarDetail());
        System.out.println(B.getCarDetail());
    }
}