package cts.spital.model;

public class InternarePacientTemplate extends InternareTemplate {

    @Override
    protected void analizeazaStare() {
        System.out.println("Se analizeaza starea pacientului.");
    }

    @Override
    protected void verificaDisponibilitate() {
        System.out.println("Se verifica disponibilitatea saloanelor.");
    }

    @Override
    protected void emiteFisaInternare() {
        System.out.println("Se emite fisa de internare.");
    }
}