package cts.spital.model;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements Cloneable {
    private String nume;
    private Map<String, Float> solutii;

    public Reteta(String nume, Map<String, Float> solutii) {
        this.nume = nume;
        this.solutii = solutii;
    }

    private Reteta() {
    }

    @Override
    public Reteta clone() {
        Reteta copie = new Reteta();
        copie.nume = this.nume;
        copie.solutii = new HashMap<>(this.solutii);
        return copie;
    }

    @Override
    public String toString() {
        return "Reteta{" + "nume='" + nume + '\'' + ", solutii=" + solutii + '}';
    }
}