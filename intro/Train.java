package intro;

public class Train extends Vehicle{
    private double coal;

    public Train(String name, double coal) {
        super(name, 100);
        this.coal = coal;
    }

    public double getCoal() {return coal;}
    public void runTrain(int distance) {
        move(distance);
        System.out.println("Coal Before Use: " + coal);
        coal *= (Math.log(distance)) / distance;
        System.out.println("Coal Remaining: " + coal);
    }

}
