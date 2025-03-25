package overriding;

public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;
    
    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
      super(licensePlate, tollFee, passengers);
      this.axles = axles;
      this.hasTrailer = hasTrailer;
    }
  
    public int getAxles() {
      return axles;
    }
  
    public boolean hasTrailer() {
      return hasTrailer;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Axles: " + axles);
        System.out.println("Has Trailer: " + hasTrailer);
    }

    public boolean validateLicensePlate() {
        if (axles > 4 && hasTrailer && getLicensePlate().substring(getLicensePlate().length() - 2).equals("MX")) {
            return true;
        }
        if (axles <= 4 && hasTrailer && getLicensePlate().substring(getLicensePlate().length() - 2).equals("LX")) {
            return true;
        }
        if (!hasTrailer) {
            return true;
        }
        return false;
    }

    @Override
    public double calculateTollPrice() {
        double cost = getTollFee() * axles;
        if (hasTrailer) {
          return cost * 2;
        }
        return cost;
    }


  }