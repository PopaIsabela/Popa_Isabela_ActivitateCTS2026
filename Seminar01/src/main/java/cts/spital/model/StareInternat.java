package cts.spital.model;

public class StareInternat implements StarePacient {

    @Override
    public void modificaStare(PacientState pacient) {
        System.out.println("Pacientul "
                + pacient.getNume()
                + " este INTERNAT.");
    }
}