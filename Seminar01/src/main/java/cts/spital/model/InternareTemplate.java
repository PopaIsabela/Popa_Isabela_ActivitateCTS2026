package cts.spital.model;

public abstract class InternareTemplate {

    public final void interneazaPacient() {
        analizeazaStare();
        verificaDisponibilitate();
        emiteFisaInternare();
    }

    protected abstract void analizeazaStare();

    protected abstract void verificaDisponibilitate();

    protected abstract void emiteFisaInternare();
}