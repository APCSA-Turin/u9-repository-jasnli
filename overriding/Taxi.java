package overriding;

public class Taxi extends Car {
    private double fareCollected;
    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public double getFareCollected() {return fareCollected;}

    @Override
    public void printInfo() {
        super.printInfo();
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

    public boolean chargeAndDropOffRiders(double farePerRider) {
        fareCollected += farePerRider * (getPassengers() - 1);
        return dropOffPassengers(getPassengers() - 1);
    }

    @Override
    public boolean hasTaxiLicense() {
        System.out.println("Has taxi license...");
        return true;
      }
}
