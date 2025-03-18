package day2;

public class Cat extends Animal{
    private boolean hasPlayedWith;
    private int purr;
    
    public Cat(String name, int age) {
        super(name, age);
        hasPlayedWith = false;
    }

    public boolean playedWith() {return hasPlayedWith;}
    public int purrs() {return purr;}

    public void play() {
        hasPlayedWith = true;
    }

    public void pet() {
        if (purr > 0) {
            System.out.println("Meow 😺");
        } else {
            System.out.println("Grrr 😺");
        }
    }
}
