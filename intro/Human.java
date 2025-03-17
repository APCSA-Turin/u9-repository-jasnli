package intro;

public class Human extends Creature {
    private int phoneNumber;

    public Human(String name, int pn) {
        super(name, 100);
        this.phoneNumber = pn;
    }

    public int getPhoneNumber(){return phoneNumber;}

    public void callMe() {
        System.out.println("Calling... " + phoneNumber);
        System.out.println("HELLO!");
    }
}
