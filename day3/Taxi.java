package day3;

public class Taxi extends Car {
    private double fareCollected;
    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public double getFareCollected() {return fareCollected;}

    public void printTaxi() {
        System.out.println("License Plate: " + getLicensePlate());
        System.out.println("Toll Fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Electric: " + isElectric());
        System.out.println("Discount Applied: " + isDiscountApplied());
        System.out.println("Fair Collected: " + fareCollected);
    }

    public void pickupRiders(int numRiders, double farePerRider) {
        setPassengers(getPassengers() + numRiders);
        fareCollected += farePerRider * numRiders;
        if (!isDiscountApplied()) {
            if (getPassengers() > 4) {
                setTollFee(getTollFee() * 0.5);
                setDiscountApplied(true);
            }
        }
    }
}
