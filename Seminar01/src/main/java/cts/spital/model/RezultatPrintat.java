package cts.spital.model;

public class RezultatPrintat implements Rezultat {

    private String numePacient;

    public RezultatPrintat(String numePacient) {
        this.numePacient = numePacient;
    }

    @Override
    public void afiseazaRezultat() {
        System.out.println("Rezultatul pacientului "
                + numePacient
                + " este printat.");
    }
}