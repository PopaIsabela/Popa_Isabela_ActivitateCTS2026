package cts.spital.model;

public class ComandaInternare implements Comanda {

    private MedicComanda medic;
    private String numePacient;

    public ComandaInternare(MedicComanda medic, String numePacient) {
        this.medic = medic;
        this.numePacient = numePacient;
    }

    @Override
    public void executa() {
        medic.interneazaPacient(numePacient);
    }
}