package cts.spital.model;

import java.util.ArrayList;
import java.util.List;

public class Departament extends StructuraSpital {

    private List<StructuraSpital> structuri =
            new ArrayList<>();

    public Departament(String nume) {
        super(nume);
    }

    @Override
    public void adaugaStructura(StructuraSpital structura) {
        structuri.add(structura);
    }

    @Override
    public void stergeStructura(StructuraSpital structura) {
        structuri.remove(structura);
    }

    @Override
    public void afiseazaStructura(String indentare) {

        System.out.println(indentare +
                "Departament: " + nume);

        for (StructuraSpital s : structuri) {
            s.afiseazaStructura(indentare + "   ");
        }
    }
}