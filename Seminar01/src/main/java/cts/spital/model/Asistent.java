package cts.spital.model;

public class Asistent extends PersonalSpital {
    public Asistent(String nume) {
        super(nume);
    }

    @Override
    public void afisare() {
        System.out.println("Asistent: " + nume);
    }
}