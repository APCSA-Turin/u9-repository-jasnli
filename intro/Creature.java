package intro;

public class Creature {
    private String name;
    private double health;
    private int level;

    public Creature(String name, double health) {
        this.name = name;
        this.health = health;
        level = 1;
    }

    public String getName(){return name;}
    public double getHealth(){return health;}
    public int getLevel(){return level;}

    public void setHealth(double health){this.health = health;}
    
    public void levelUp() {
        level++;
        System.out.println("Leveled Up! " + name + " is now level " + level);
        System.out.println("+" + health * 0.1 + " health!");
        health += health * 0.1;
        
    }

}
