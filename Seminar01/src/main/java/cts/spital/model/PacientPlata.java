package cts.spital.model;

public class PacientPlata {

    private String nume;
    private ModPlata modPlata;

    public PacientPlata(String nume) {
        this.nume = nume;
        this.modPlata = new PlataCash();
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void platesteInternare(float suma) {
        System.out.print("Pacientul " + nume + ": ");
        modPlata.plateste(suma);
    }
}