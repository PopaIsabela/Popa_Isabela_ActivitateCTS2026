package cts.spital.model;

public class InternareSpital implements Internare {

    @Override
    public void interneaza(PacientProxy pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " a fost internat.");
    }
}