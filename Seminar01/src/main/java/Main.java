package cts.spital.main;

import cts.spital.model.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Pacient p1 = new PacientBuilder("Isabela")
                .setMicDejunInclus(true)
                .setPapuciCamera(true)
                .build();

        Pacient p2 = new PacientBuilder("Popa")
                .setPatRabatabil(true)
                .build();

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        AbstractFactory fabricaMed = new FactoryMedical();
        AbstractFactory fabricaNonMed = new FactoryNonMedical();

        PersonalSpital personal1 = fabricaMed.createPersonal("Ionescu Andrei");
        PersonalSpital personal2 = fabricaNonMed.createPersonal("Popescu Maria");

        personal1.afisare();
        personal2.afisare();

        Map<String, Float> ingrediente = new HashMap<>();
        ingrediente.put("Substanta1", 15.0f);
        ingrediente.put("Substanta2", 25.5f);

        Reteta reteta1 = new Reteta("Reteta raceala", ingrediente);
        Reteta reteta2 = reteta1.clone();

        System.out.println(reteta1);
        System.out.println(reteta2);
    }
}