package cts.spital.model;

import java.util.ArrayList;
import java.util.List;

public class Spital implements SpitalSubject {

    private List<ObserverPacient> pacientiAbonati;

    public Spital() {
        this.pacientiAbonati = new ArrayList<>();
    }

    @Override
    public void adaugaObserver(ObserverPacient observer) {
        pacientiAbonati.add(observer);
    }

    @Override
    public void stergeObserver(ObserverPacient observer) {
        pacientiAbonati.remove(observer);
    }

    @Override
    public void notificaObserveri(String mesaj) {
        for (ObserverPacient pacient : pacientiAbonati) {
            pacient.primesteNotificare(mesaj);
        }
    }

    public void anuntaEpidemie(String virus) {
        notificaObserveri("Atentie! A aparut o epidemie cu virusul: " + virus);
    }
}