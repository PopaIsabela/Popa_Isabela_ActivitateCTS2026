package cts.spital.model;

public interface SpitalSubject {
    void adaugaObserver(ObserverPacient observer);
    void stergeObserver(ObserverPacient observer);
    void notificaObserveri(String mesaj);
}