package cts.spital.model;

public class RezultatOnline extends DecoratorRezultat {

    public RezultatOnline(Rezultat rezultat) {
        super(rezultat);
    }

    @Override
    public void afiseazaRezultat() {
        super.afiseazaRezultat();
        System.out.println("Rezultatul este disponibil online.");
    }
}