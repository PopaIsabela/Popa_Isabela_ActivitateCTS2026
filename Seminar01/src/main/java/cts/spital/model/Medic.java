package cts.spital.model;

public class Medic extends PersonalSpital {
    public Medic(String nume) {
        super(nume);
    }

    @Override
    public void afisare() {
        System.out.println("Medic: " + nume);
    }
}