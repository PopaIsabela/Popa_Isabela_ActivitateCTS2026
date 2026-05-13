package cts.spital.model;

public class PacientProxy {
    private String nume;
    private boolean areAsigurare;

    public PacientProxy(String nume, boolean areAsigurare) {
        this.nume = nume;
        this.areAsigurare = areAsigurare;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAreAsigurare() {
        return areAsigurare;
    }
}