package cts.spital.model;

public class InternareContext {

    private int numarSalon;
    private int numarPat;
    private int numarZileSpitalizare;

    public InternareContext(int numarSalon, int numarPat, int numarZileSpitalizare) {
        this.numarSalon = numarSalon;
        this.numarPat = numarPat;
        this.numarZileSpitalizare = numarZileSpitalizare;
    }

    public int getNumarSalon() {
        return numarSalon;
    }

    public int getNumarPat() {
        return numarPat;
    }

    public int getNumarZileSpitalizare() {
        return numarZileSpitalizare;
    }
}