package cts.spital.model;

public abstract class DecoratorRezultat implements Rezultat {

    protected Rezultat rezultat;

    public DecoratorRezultat(Rezultat rezultat) {
        this.rezultat = rezultat;
    }

    @Override
    public void afiseazaRezultat() {
        rezultat.afiseazaRezultat();
    }
}