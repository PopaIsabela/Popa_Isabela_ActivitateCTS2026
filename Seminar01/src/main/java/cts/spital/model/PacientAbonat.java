package cts.spital.model;

public class PacientAbonat implements ObserverPacient {

    private String nume;

    public PacientAbonat(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Pacientul " + nume + " a primit notificarea: " + mesaj);
    }
}