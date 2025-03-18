package day2;

public class Dog extends Animal {
    private boolean hasBeenWalked;
    private int pants;

    public Dog(String name, int age) {
        super(name, age);
        hasBeenWalked = false;
        pants = 0;
    }

    public boolean walked() {return hasBeenWalked;}
    public int pants() {return pants;}

    public void walk() {
        hasBeenWalked = true;
    }

    public void fetch() {
        pants++;
        System.out.println("FETCH!");
    }

}
