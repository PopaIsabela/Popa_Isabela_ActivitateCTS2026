package cts.spital.model;

public class ComandaTratare implements Comanda {

    private MedicComanda medic;
    private String numePacient;

    public ComandaTratare(MedicComanda medic, String numePacient) {
        this.medic = medic;
        this.numePacient = numePacient;
    }

    @Override
    public void executa() {
        medic.trateazaPacient(numePacient);
    }
}