package day3;

public class Main {
    public static void main(String[] args) {
        // -------------- LAB PART 1 -----------------
        // a. write code to create a Vehicle object with license "MC56WQ",
        //    toll fee of 10.75, and 5 passengers.
        //    Print out the calculated toll TollPrice.
        Vehicle v = new Vehicle("MC56WQ", 10.75, 5);
        System.out.println(v.calculateTollPrice());

        // b. write code to create an electric Car with license "KXN73F",
        //    toll fee of 8.50, and 2 passengers.
        //    Print out the calculated toll price
        Car eCar = new Car("KXN73F", 8.50, 2, true);
        System.out.println(eCar.calculateTollPrice());

        // c. add a printCar() void method to the Car class that prints the
        //    Car's license plate, toll fee, number of passengers, whether it is electric,
        //    and whether a discount has been applied.
        //
        // d. call the method on the Car you made in c to test it.
        eCar.printCar();

        // e. write code to create a Truck with license "3K9JMX",
        //    a toll fee of 24.75, 4 passengers, 6 axles, with a trailer.
        //    Print out the calculated toll price
        Truck t = new Truck("3K9JMX", 24.75, 4, 6, true);
        System.out.println(t.calculateTollPrice());

        // f. add a printTruck() void method to the Truck class that prints the
        //    Truck's license plate, toll fee, number of passengers, number of axles,
        //    and whether it has a trailer.
        //
        // g. call the method on the Truck you made in e to test it.
        t.printTruck();

        // ------------ LAB PART 2 ---------------
        // ----- instructions in lab sheet -------
        Taxi x = new Taxi("8KM23Z", 9.25, 3, true, 5.00);
        System.out.println(x.getLicensePlate());
        System.out.println(x.getTollFee());
        System.out.println(x.getPassengers());
        System.out.println(x.isElectric());
        System.out.println(x.calculateTollPrice());
        System.out.println(x.getFareCollected());
        System.out.println(x.isDiscountApplied());
        x.printCar();   
        x.printTaxi();

        // ------------ LAB PART 3 ---------------
        // // ----- instructions in lab sheet -------
        // System.out.println("--- Testing method on a Car object ---");
        // Car testCar1 = new Car("KXN73F", 8.50, 5, true);
        // System.out.println(testCar1.getPassengers());
        // System.out.println("-----------");
        // boolean success = testCar1.dropOffPassengers(3);
        // System.out.println(success);
        // System.out.println(testCar1.getPassengers());
        // System.out.println("-----------");
        // success = testCar1.dropOffPassengers(3);
        // System.out.println(success);
        // System.out.println(testCar1.getPassengers());
        // System.out.println("--- Testing method on a Taxi object ---");
        // Taxi testTaxi1 = new Taxi("JMD645", 10.35, 3, false, 5.0);
        // System.out.println(testTaxi1.getPassengers());
        // System.out.println("-----------");
        // success = testTaxi1.dropOffPassengers(3);
        // System.out.println(success);
        // System.out.println(testTaxi1.getPassengers());
        // System.out.println("-----------");
        // success = testTaxi1.dropOffPassengers(2);
        // System.out.println(success);
        // System.out.println(testTaxi1.getPassengers());
        // System.out.println("-----------");
        // // my own
        // Taxi a1 = new Taxi("AHENDJW", 10, 10, true, 10);
        // Car a2 = new Car("WHWUFJ", 20, 5, true);
        // System.out.println(a1.dropOffPassengers(19));
        // System.out.println(a2.dropOffPassengers(2));
        // System.out.println(a1.getPassengers());
        // System.out.println(a2.getPassengers());
        System.out.println("--------- TEST 1 ---------");
System.out.println("---- non-electric Taxi ---");
System.out.println("--------------------------");
Taxi t1 = new Taxi("JMD645", 10.0, 1, false, 5.0); // not electric
t1.applyDiscount();
System.out.println("discount already applied? " + t1.isDiscountApplied());
System.out.println("toll fee: " + t1.getTollFee());
System.out.println("total fare collected: " + t1.getFareCollected());
System.out.println("total passengers: " + t1.getPassengers());
if (!t1.isDiscountApplied() && t1.getTollFee() == 10.0 && t1.getFareCollected() == 5.0 && t1.getPassengers() == 1) {
  System.out.println("------------------------ TEST 1a PASS!");
} else {
  System.out.println("------------------------ !!!!!!!!!!!!!!!TEST 1a FAIL!!!!!!!!!!!!!!!!!! ---");
}
t1.pickupRiders(2, 3.75);
System.out.println("discount already applied? " + t1.isDiscountApplied());
System.out.println("toll fee: " + t1.getTollFee());
System.out.println("total fare collected: " + t1.getFareCollected());
System.out.println("total passengers: " + t1.getPassengers());
if (!t1.isDiscountApplied() && t1.getTollFee() == 10.0 && t1.getFareCollected() == 12.5 && t1.getPassengers() == 3) {
  System.out.println("------------------------ TEST 1b PASS!");
} else {
  System.out.println("------------------------ !!!!!!!!!!!!!!!TEST 1b FAIL!!!!!!!!!!!!!!!!!! ---");
}
t1.pickupRiders(2, 5.90);
System.out.println("discount already applied? " + t1.isDiscountApplied());
System.out.println("toll fee: " + t1.getTollFee());
System.out.println("total fare collected: " + t1.getFareCollected());
System.out.println("total passengers: " + t1.getPassengers());
if (t1.isDiscountApplied() && t1.getTollFee() == 5.0 && t1.getFareCollected() == 24.3 && t1.getPassengers() == 5) {
  System.out.println("------------------------ TEST 1c PASS!");
} else {
  System.out.println("------------------------ !!!!!!!!!!!!!!!TEST 1c FAIL!!!!!!!!!!!!!!!!!! ---");
}
t1.pickupRiders(3, 3.40);
System.out.println("discount already applied? " + t1.isDiscountApplied());
System.out.println("toll fee: " + t1.getTollFee());
System.out.println("total fare collected: " + t1.getFareCollected());
System.out.println("total passengers: " + t1.getPassengers());
if (t1.isDiscountApplied() && t1.getTollFee() == 5.0 && t1.getFareCollected() == 34.5 && t1.getPassengers() == 8) {
  System.out.println("------------------------ TEST 1d PASS!");
} else {
  System.out.println("------------------------ !!!!!!!!!!!!!!!TEST 1d FAIL!!!!!!!!!!!!!!!!!! ---");
}
System.out.println("\n--------- TEST 2 ---------");
System.out.println("----- electric Taxi ------");
System.out.println("--------------------------");
Taxi t2 = new Taxi("KCD123", 25, 1, true, 6.0); // electric
t2.applyDiscount();
System.out.println("discount already applied? " + t2.isDiscountApplied());
System.out.println("toll fee: " + t2.getTollFee());
System.out.println("total fare collected: " + t2.getFareCollected());
System.out.println("total passengers: " + t2.getPassengers());
if (t2.isDiscountApplied() && t2.getTollFee() == 12.5 && t2.getFareCollected() == 6.0 && t2.getPassengers() == 1) {
  System.out.println("------------------------ TEST 2a PASS!");
} else {
  System.out.println("------------------------ !!!!!!!!!!!!!!!TEST 2a FAIL!!!!!!!!!!!!!!!!!! ---");
}
t2.pickupRiders(2, 3.7);
System.out.println("discount already applied? " + t2.isDiscountApplied());
System.out.println("toll fee: " + t2.getTollFee());
System.out.println("total fare collected: " + t2.getFareCollected());
System.out.println("total passengers: " + t2.getPassengers());
if (t2.isDiscountApplied() && t2.getTollFee() == 12.5 && t2.getFareCollected() == 13.4 && t2.getPassengers() == 3) {
  System.out.println("------------------------ TEST 2b PASS!");
} else {
  System.out.println("------------------------ !!!!!!!!!!!!!!!TEST 2b FAIL!!!!!!!!!!!!!!!!!! ---");
}
t2.pickupRiders(2, 4.75);
System.out.println("discount already applied? " + t2.isDiscountApplied());
System.out.println("toll fee: " + t2.getTollFee());
System.out.println("total fare collected: " + t2.getFareCollected());
System.out.println("total passengers: " + t2.getPassengers());
if (t2.isDiscountApplied() && t2.getTollFee() == 12.5 && t2.getFareCollected() == 22.9 && t2.getPassengers() == 5) {
  System.out.println("------------------------ TEST 2c PASS!");
} else {
  System.out.println("------------------------ !!!!!!!!!!!!!!!TEST 2c FAIL!!!!!!!!!!!!!!!!!! ---");
}

    }
}