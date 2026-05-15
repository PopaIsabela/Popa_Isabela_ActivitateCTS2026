package cts.spital.model;

public class PacientState {

    private String nume;
    private StarePacient stare;

    public PacientState(String nume) {
        this.nume = nume;
    }

    public void setStare(StarePacient stare) {
        this.stare = stare;
        stare.modificaStare(this);
    }

    public String getNume() {
        return nume;
    }
}