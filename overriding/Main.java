package overriding;

public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle("MK4567", 6.75, 4);
        myVehicle.hasTaxiLicense();
        System.out.println();
        Truck myTruck = new Truck("TB12MX", 15.50, 2, 4, true);
        myTruck.hasTaxiLicense();
        System.out.println();
        Vehicle myCar = new Car("MK4567", 6.75, 4, true);
        myCar.hasTaxiLicense();
        System.out.println();
        Vehicle myTaxi = new Taxi("MK4567", 6.75, 4, true, 0);
        myTaxi.hasTaxiLicense();
        System.out.println();
        
        
        
        
        
    }
}