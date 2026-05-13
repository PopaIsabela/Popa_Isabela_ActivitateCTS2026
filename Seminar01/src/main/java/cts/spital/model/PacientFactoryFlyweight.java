package cts.spital.model;

import java.util.HashMap;
import java.util.Map;

public class PacientFactoryFlyweight {

    private Map<String, PacientFlyweight> pacienti;

    public PacientFactoryFlyweight() {
        this.pacienti = new HashMap<>();
    }

    public PacientFlyweight getPacient(String nume, String telefon, String adresa) {
        String cheie = nume + "_" + telefon;

        if (!pacienti.containsKey(cheie)) {
            pacienti.put(cheie, new PacientInfo(nume, telefon, adresa));
        }

        return pacienti.get(cheie);
    }

    public int getNumarPacienti() {
        return pacienti.size();
    }
}