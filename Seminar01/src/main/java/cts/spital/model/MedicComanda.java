package cts.spital.model;

public class MedicComanda {

    private String nume;

    public MedicComanda(String nume) {
        this.nume = nume;
    }

    public void interneazaPacient(String numePacient) {
        System.out.println("Medicul " + nume
                + " interneaza pacientul " + numePacient + ".");
    }

    public void trateazaPacient(String numePacient) {
        System.out.println("Medicul " + nume
                + " trateaza imediat pacientul " + numePacient + ".");
    }
}