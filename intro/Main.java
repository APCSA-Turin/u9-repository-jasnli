package intro;

public class Main {
    public static void main(String[] args) {


        // testing all available methods on a Vehicle object
        Vehicle myVehicle = new Vehicle("Generic Vehicle", 6);
        System.out.println(myVehicle.getName());
        System.out.println(myVehicle.getWheels());
        myVehicle.move(10);
        myVehicle.turn();
        myVehicle.brake();

        // testing all available methods on a Car object
        Car myCar = new Car("Honda Civic", 4, "leather");
        System.out.println(myCar.getName()); // inherited method
        System.out.println(myCar.getWheels()); // inherited method
        System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        myCar.move(30); // inherited method
        myCar.turn(); // inherited method
        myCar.brake(); // inherited method
        myCar.honk(); // method ONLY available on Car objects
        myCar.lockDoors(); // method ONLY available on Car objects

        // ---- WRITE YOUR BICYCLE TEST CODE BELOW ----
        Bicycle myBike = new Bicycle("andy", 20);
        System.out.println(myBike.getName());
        System.out.println(myBike.getWheels());
        System.out.println(myBike.getGearCount());
        myBike.move(10);
        myBike.turn();
        myBike.brake();
        myBike.ringBell();
        System.out.println("-------------------------------------");
        // TRAIN CODE
        Train myTrain = new Train("jerry", 2000);
        System.out.println(myTrain.getName());
        System.out.println(myTrain.getWheels());
        System.out.println(myTrain.getCoal());
        myTrain.move(10);
        myTrain.turn();
        myTrain.brake();
        myTrain.runTrain(10);
        myTrain.runTrain(10);
        myTrain.runTrain(10);
        System.out.println("-------------------------------------");

        // CREATURE CODE
        Creature cr = new Creature("shelly", 500);
        System.out.println("Health: " + cr.getHealth());
        System.out.println("Level: " + cr.getLevel());
        System.out.println("Name: " + cr.getName());
        cr.levelUp();
        System.out.println("Level: " + cr.getLevel());
        System.out.println("Health: " + cr.getHealth());
        // HUMAN CODE
        System.out.println("-------------------------------------");
        Human hm = new Human("Cormac", 1001001000);
        System.out.println("Health: " + hm.getHealth());
        System.out.println("Level: " + hm.getLevel());
        System.out.println("Name: " + hm.getName());
        System.out.println("Number: " + hm.getPhoneNumber());
        hm.levelUp();
        System.out.println("Level: " + hm.getLevel());
        System.out.println("Health: " + hm.getHealth());
        hm.callMe();
        // FROG
        System.out.println("-------------------------------------");
        Frog fr = new Frog("Cherine");
        System.out.println("Health: " + fr.getHealth());
        System.out.println("Level: " + fr.getLevel());
        System.out.println("Name: " + fr.getName());
        System.out.println("Tongue Stickiness of " + fr.getTongueStickiness());
        fr.levelUp();
        System.out.println("Level: " + fr.getLevel());
        System.out.println("Health: " + fr.getHealth());
        fr.catchFly();
        fr.catchFly();
        fr.catchFly();
        fr.catchFly();
        

        
    }
}