package cts.spital.model;

public class PacientInternare {

    private String nume;
    private boolean stareGrava;

    public PacientInternare(String nume, boolean stareGrava) {
        this.nume = nume;
        this.stareGrava = stareGrava;
    }

    public boolean verificaStare() {
        return stareGrava;
    }

    public String getNume() {
        return nume;
    }
}