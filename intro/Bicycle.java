package intro;

public class Bicycle extends Vehicle {
    private int gearCount;

    public Bicycle(String name, int gearCount) {
        super(name, 2);
        this.gearCount = gearCount;
    }

    public int getGearCount() {return gearCount;}

    public void ringBell() {
        System.out.println("ring!");
    }



}