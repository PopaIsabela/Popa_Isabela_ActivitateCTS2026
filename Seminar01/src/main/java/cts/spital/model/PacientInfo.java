package cts.spital.model;

public class PacientInfo implements PacientFlyweight {

    private String nume;
    private String telefon;
    private String adresa;

    public PacientInfo(String nume, String telefon, String adresa) {
        this.nume = nume;
        this.telefon = telefon;
        this.adresa = adresa;
    }

    @Override
    public void afiseazaInternare(InternareContext context) {
        System.out.println("Pacient: " + nume
                + ", telefon: " + telefon
                + ", adresa: " + adresa
                + " | Salon: " + context.getNumarSalon()
                + ", pat: " + context.getNumarPat()
                + ", zile: " + context.getNumarZileSpitalizare());
    }
}