package cts.spital.model;

public class Sectie extends StructuraSpital {

    public Sectie(String nume) {
        super(nume);
    }

    @Override
    public void adaugaStructura(StructuraSpital structura) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeStructura(StructuraSpital structura) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afiseazaStructura(String indentare) {

        System.out.println(indentare +
                "Sectie: " + nume);
    }
}