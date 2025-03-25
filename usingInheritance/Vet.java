package usingInheritance;
import java.util.*;

public class Vet {
    private String vetName;
    private ArrayList<Animal> clients;

    public Vet (String vetName) {
        this.vetName = vetName;
        clients = new ArrayList<>();
    }

    public boolean addClient(Animal c) {
        if (clients.indexOf(c) != -1) {
            System.out.println(c.getName() + " is already a client of " + vetName);
            return false;
        }
        clients.add(c);
        System.out.println("Welcome to  " + vetName + " office, " + c.getName());
        return true;
    }

    public void printClientList() {
        for (Animal c : clients) {
            System.out.println(c.getName() + c.getClass());
        }
    }

}
