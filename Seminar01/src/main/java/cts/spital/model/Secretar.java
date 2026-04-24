package cts.spital.model;

public class Secretar extends PersonalSpital {
    public Secretar(String nume) {
        super(nume);
    }

    @Override
    public void afisare() {
        System.out.println("Secretar: " + nume);
    }
}