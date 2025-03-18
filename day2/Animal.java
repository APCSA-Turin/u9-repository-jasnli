package day2;

public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;
    private double hungerMeter;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        vaccinated = false;
        hungerMeter = 0;
    }

    public String getName() {return name;}
    public int getAge() {return age;}
    public boolean isVaccinated() {return vaccinated;}
    public double hunger() {return hungerMeter;}

    public void adopt() {
        System.out.println(name + " has been adopted!");
    }

    public void feed() { 
        if (hungerMeter < 1) {
           hungerMeter += 0.1; 

           System.out.println(name + " has been fed!");
        } else {
            System.out.println(name + " is full. It cannot eat anymore!");
        }     
    }

    public void birthday() {
        age++;
        System.out.println("It is " + name + "'s birthday! It is now " + age + " years old!");
    }

    public void evacuate() {
        hungerMeter = 0;
        System.out.println("WASTE DISPOSED...");
    }

    

}
