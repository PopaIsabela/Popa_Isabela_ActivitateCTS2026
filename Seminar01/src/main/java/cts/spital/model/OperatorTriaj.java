package cts.spital.model;

import java.util.ArrayList;
import java.util.List;

public class OperatorTriaj {

    private List<Comanda> comenzi;

    public OperatorTriaj() {
        this.comenzi = new ArrayList<>();
    }

    public void adaugaComanda(Comanda comanda) {
        comenzi.add(comanda);
    }

    public void trimiteComenzi() {
        for (Comanda comanda : comenzi) {
            comanda.executa();
        }
        comenzi.clear();
    }
}