package cts.spital.model;

public class PlataCash implements ModPlata {

    @Override
    public void plateste(float suma) {
        System.out.println("Plata in valoare de " + suma + " lei a fost realizata cash.");
    }
}