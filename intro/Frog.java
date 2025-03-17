package intro;

public class Frog extends Creature{
    private double tongueStickiness;

    public Frog(String name) {
        super(name, 25);
        tongueStickiness = 2.80;
    }

    public double getTongueStickiness() {return tongueStickiness;}

    private void eatFly() {
        System.out.println("Fly Eaten! Health + 5!");
        setHealth(getHealth() + 5);
    }

    public void catchFly() {
        System.out.println(getName() + " sticks out its tongue...");
        if (tongueStickiness >= 0.2) {
            eatFly();
            double downFactor = tongueStickiness * Math.random();
            System.out.println("Stickiness used... " + (downFactor));
            tongueStickiness -= downFactor;
            System.out.println("Stickiness Remaining: " + tongueStickiness);
        } else {
            System.out.println("Tongue not sticky enough, fly escaped!");
        }

    }
}
