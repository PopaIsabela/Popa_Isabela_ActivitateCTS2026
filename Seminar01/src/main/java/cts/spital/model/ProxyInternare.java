package cts.spital.model;

public class ProxyInternare implements Internare {

    private Internare internareSpital;

    public ProxyInternare(Internare internareSpital) {
        this.internareSpital = internareSpital;
    }

    @Override
    public void interneaza(PacientProxy pacient) {
        if (pacient.isAreAsigurare()) {
            internareSpital.interneaza(pacient);
        } else {
            System.out.println("Pacientul " + pacient.getNume()
                    + " nu poate fi internat deoarece nu are asigurare.");
        }
    }
}