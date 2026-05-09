package cts.spital.model;

public class FacadeInternare {

    public void verificaInternare(PacientInternare pacient,
                                  MedicInternare medic,
                                  Salon salon) {

        if (pacient.verificaStare()
                && medic.confirmaInternare()
                && salon.verificaPatLiber()) {

            System.out.println("Pacientul "
                    + pacient.getNume()
                    + " poate fi internat.");
        } else {
            System.out.println("Pacientul nu poate fi internat.");
        }
    }
}