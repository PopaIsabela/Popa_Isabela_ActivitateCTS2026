package cts.spital.main;

import cts.spital.model.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== A1 BUILDER =====");

        Pacient p1 = new PacientBuilder("Isabela")
                .setMicDejunInclus(true)
                .setPapuciCamera(true)
                .build();

        Pacient p2 = new PacientBuilder("Popa")
                .setPatRabatabil(true)
                .build();

        System.out.println(p1);
        System.out.println(p2);


        System.out.println("\n===== A3 ABSTRACT FACTORY =====");

        AbstractFactory fabricaMed = new FactoryMedical();
        AbstractFactory fabricaNonMed = new FactoryNonMedical();

        PersonalSpital personal1 = fabricaMed.createPersonal("Ionescu Andrei");
        PersonalSpital personal2 = fabricaNonMed.createPersonal("Popescu Maria");

        personal1.afisare();
        personal2.afisare();


        System.out.println("\n===== A4 PROTOTYPE =====");

        Map<String, Float> ingrediente = new HashMap<>();
        ingrediente.put("Substanta1", 15.0f);
        ingrediente.put("Substanta2", 25.5f);

        Reteta reteta1 = new Reteta("Reteta raceala", ingrediente);
        Reteta reteta2 = reteta1.clone();

        System.out.println(reteta1);
        System.out.println(reteta2);


        System.out.println("\n===== A6 FACADE =====");

        PacientInternare pacientInternare =
                new PacientInternare("Popa Isabela", true);

        MedicInternare medicInternare =
                new MedicInternare(true);

        Salon salon =
                new Salon(2);

        FacadeInternare facadeInternare =
                new FacadeInternare();

        facadeInternare.verificaInternare(
                pacientInternare,
                medicInternare,
                salon
        );


        System.out.println("\n===== A7 DECORATOR =====");

        Rezultat rezultatPrintat =
                new RezultatPrintat("Popa Isabela");

        rezultatPrintat.afiseazaRezultat();

        System.out.println();

        Rezultat rezultatOnline =
                new RezultatOnline(rezultatPrintat);

        rezultatOnline.afiseazaRezultat();
    }
}